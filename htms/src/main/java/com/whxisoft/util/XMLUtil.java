package com.whxisoft.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.CollectionUtils;
import org.springframework.util.ObjectUtils;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.StringWriter;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class XMLUtil {
    private static final Logger log = LoggerFactory.getLogger(XMLUtil.class);

    public static Map<String, String> map2Xml(Map<String, List<?>> map) {
        Map<String, String> xmls = new LinkedHashMap<>();

        for (Map.Entry<String, List<?>> entry : map.entrySet()) {
            List<?> list = entry.getValue();
            StringBuilder sb = new StringBuilder();
            sb.append("<").append("body").append(">");
            if (!CollectionUtils.isEmpty(list)) {
                for (Object object : list) {
                    String xml = object2Xml(object);
                    sb.append(xml);
                }
            }
//            else {
//                sb.append("<").append(entry.getKey()).append(">").append("</").append(entry.getKey()).append(">");
//            }
            sb.append("</").append("body").append(">");

            xmls.put(entry.getKey(), sb.toString());
        }

        return xmls;
    }

    public static <T> String bean2Xml(T t) {
        StringBuilder sb = new StringBuilder();
        if (!ObjectUtils.isEmpty(t)) {
            sb.append("<").append("body").append(">");
            sb.append(object2Xml(t));
            sb.append("</").append("body").append(">");
        }

        return sb.toString();
    }

    private static <T> String object2Xml(T t) {
        String xmlContent = "";
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(t.getClass());
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
//            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            jaxbMarshaller.setProperty(Marshaller.JAXB_FRAGMENT, Boolean.TRUE);
            StringWriter sw = new StringWriter();
            jaxbMarshaller.marshal(t, sw);
            xmlContent = sw.toString();
        } catch (JAXBException e) {
            log.debug("exception -> " + e.getMessage());
        }

        return xmlContent;
    }
}
