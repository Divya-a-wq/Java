package com.example.challenge89;

class varArgs {
    public static void main(String[] args) {
        System.out.println(concatenation("divya"));
        System.out.println(concatenation("Nishad"));
    }
    public static String concatenation(String... strs){
        StringBuilder sb=new StringBuilder();
        for(String str:strs){
            sb.append(str).append(" ");
        }
        return sb.toString();

    }

}
