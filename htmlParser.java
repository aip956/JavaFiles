// https://leetcode.com/problems/html-entity-parser/submissions/

public class htmlParser {
    public static String entityParser(String text) {
        char[] textArr = text.toCharArray();
        StringBuilder modText = new StringBuilder();
        int i = 0;
        while (i < textArr.length) {
            // System.out.println("12i: " + i);
            // System.out.println("12textArr[i]: " + textArr[i]);
            if (textArr[i] == '&') {
                // System.out.println("13i: " + i);
                // System.out.println("14 = &");
                int beginI = i;
                // System.out.println("16beginI " + beginI);
                int endI = i + 1;    
                // System.out.println("18endI: " + endI);
                
                while (endI < textArr.length && textArr[endI] != ';'){
                    if (textArr[endI] == '&') {
                        // System.out.println("18break");
                        break;
                    }
                    endI++;
                }
                // System.out.println("27endI: " + endI);
                   // }

                if (endI < textArr.length && textArr[endI] == ';') {
                    String entity = text.substring(beginI, endI + 1);
                    // System.out.println("entity: " + entity);
                    switch (entity) {
                        case "&quot;":
                            modText.append('"');
                            break;
                        case "&apos;":
                            modText.append('\'');
                            break;
                        case "&lt;":
                            modText.append('<');
                            break;
                        case "&gt;":
                            modText.append('>');
                            break;
                        case "&frasl;":
                            modText.append('/');
                            break;
                        case "&amp;":
                            modText.append('&');
                            break;
                        default:
                            modText.append(entity);
                            break;
                    }
                    i = endI + 1;
                    // System.out.println("50Mod: " + Arrays.toString(textArr));
                    // System.out.println("50Mod: " + modText.toString());
                    // System.out.println("i: " + i);
                } 
                else {
                    // System.out.println("62 else");
                    modText.append(textArr[i]);
                    // System.out.println("61Mod: " + modText.toString());
                    // System.out.println("68i: " + i);
                    i++;
                }
            } 

            else {
                // System.out.println("75Char: " + textArr[i]);
                modText.append(textArr[i]); 
                // System.out.println("66Mod: " + modText.toString());
                // System.out.println("76i: " + i);
                i++;
            }
            // i++;
        }
        return modText.toString();
    }

    public static void main(String[] args) {
        String text1 = "&amp; is an HTML entity but &ambassador; is not.";
        String text2 = "and I quote: &quot;...&quot;";
        String text3 = "&amp;gt;";
        String text4 = "x &gt; y &amp;&amp; x &lt; y is always false";
        String text5 = "leetcode.com&frasl;problemset&frasl;all";
        String text6 = "&&&";

        System.out.println("Output1: " + entityParser(text1)); // Output: 
        System.out.println("Output2: " + entityParser(text2));
        System.out.println("Output3: " + entityParser(text3));
        System.out.println("Output4: " + entityParser(text4));//"x > y && x < y is always false"
        System.out.println("Output5: " + entityParser(text5));
        System.out.println("Output5: " + entityParser(text6));
    }   
}


// text = text.replace("&gt;", ">");
        // text = text.replace("&quot;", "\"");
        // text = text.replace("&apos;", "'");
        // text = text.replace("&lt;", "<");
        // text = text.replace("&frasl;", "/");
        // text = text.replace("&amp;", "&");

          // Map<String, String> entityMap = new HashMap<>();
        // entityMap.put("&quot;", "\"");
        // entityMap.put("&apos;", "'");

        // entityMap.put("&apos;", "'");
        // entityMap.put("&lt;", "<");
        // entityMap.put("&amp;", "&");
        // entityMap.put("&frasl;", "/");

        // text = text.replace("&amp;", "&");

        // each pair in the entityMap
        // for (String entity : entityMap.keySet()) {
        //     text = text.replace(entity, entityMap.get(entity));
        // }
        // for (Map.Entry<String, String> entry : entityMap.entrySet()) {
        //     String entity = entry.getKey(); // entity = &quot;
        //     String character = entry.getValue(); // char = "

        //     // replaces in the text the entity with char
        //     text = text.replace(entity, character); 
        // }