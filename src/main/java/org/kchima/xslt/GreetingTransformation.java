package org.kchima.xslt;

import net.sf.saxon.Transform;

public class GreetingTransformation {

    public static void main(String[] args) throws Exception {
        // -o greeting.html greeting.xml greeting.xsl
        Transform.main(new String[]{"-s:src/main/resources/greeting.xml",
                "-xsl:src/main/resources/greeting.xsl",
                "-o:src/main/resources/greeting.html"});
    }
}
