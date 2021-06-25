package com.whxisoft.util.file;

import com.whxisoft.pojo.CmBalances;

import java.lang.reflect.Field;

public class GenerateDynamicSQL {

    public static void main(String[] args) {
        GenerateDynamicSQL.generateSQL("HT_CM_Balances", "BalancesGuid", CmBalances.class);
    }

    public static <T> void generateSQL(String tblName, String primaryKey, Class<T> clazz) {
        Field[] fields = clazz.getDeclaredFields();

        StringBuffer sb = new StringBuffer();

        sb.append("<!-- 新增" + clazz.getSimpleName() + " -->\n");
        sb.append("<insert id=\"save\" parameterType=\"" + clazz.getSimpleName() + "\">\n");
        sb.append("    " + "insert into " + tblName.trim().toLowerCase());
        sb.append("\n    <trim prefix=\"(\" suffixOverrides=\",\" suffix=\")\">\n");

        for (int i = 0; i < fields.length; i++) {
            sb.append("\t");
            sb.append("<if test=\"" + fields[i].getName() + " != null\">" + fields[i].getName() + ",</if>\n");
        }
        sb.append("    </trim>\n    values\n    <trim prefix=\"(\" suffixOverrides=\",\" suffix=\")\">\n");

        for (int i = 0; i < fields.length; i++) {
            sb.append("\t");
            sb.append("<if test=\"" + fields[i].getName() + " != null\">#{" + fields[i].getName() + "},</if>\n");
        }

        sb.append("    </trim>\n");
        sb.append("</insert>");
        System.out.println(sb);

        sb.setLength(0);

        sb.append("\n<!-- 修改" + clazz.getSimpleName() + " -->\n");
        sb.append("<update id=\"update\" parameterType=\"" + clazz.getSimpleName() + "\">\n");
        sb.append("    " + "update " + tblName.trim().toLowerCase() + "\n    <set>\n");

        for (int i = 0; i < fields.length; i++) {
            if (fields[i].getName().toLowerCase().equals(primaryKey.trim().toLowerCase())) {
                continue;
            }
            sb.append("\t");

            sb.append("<if test=\"" + fields[i].getName() + "!=null\">"
                    + fields[i].getName() + " = #{" + fields[i].getName() + "},</if>\n");
        }

        sb.append("    </set>\n");
        sb.append("    where " + primaryKey.trim() + " = #{" + primaryKey.trim() + "}\n");
        sb.append("</update>");
        System.out.println(sb);
    }

}
