package org.kchima.xslt;

import net.sf.saxon.Transform;

public class GreetingTransformation {

    public static void main(String[] args) throws Exception {
        Transform.main(new String[]{"-s:src/main/resources/greeting.xml",
                "-xsl:src/main/resources/greeting.xsl",
                "-o:src/generated/greeting.html"
        });

        Transform.main(new String[]{"-s:src/main/resources/greetings.xml",
                "-xsl:src/main/resources/greetings.xsl",
                "-o:src/generated/greetings.html"
        });
    }
}
