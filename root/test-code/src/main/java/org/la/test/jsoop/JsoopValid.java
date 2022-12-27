package org.la.test.jsoop;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;
import org.jsoup.safety.Safelist;
import org.jsoup.select.Elements;

public class JsoopValid {

    public static void main(String[] args) {
//        System.out.println("myValid: "+myValid());
//        System.out.println("myClean: "+myClean());
//        myClean();
        tagNames();
    }
    public static boolean myValid() {
        Safelist safelist = Safelist.basic();
//        Safelist safelist = Safelist.none();
//        safelist.addTags(new String[] {"head", "body", "p", "b", "i"});
        safelist.addTags("body", "h1");
        String data = "<head>Title here</head>"+
                "<body>"+
                  "<p><b> paragraph 1</b></p>"+
                  "<p><i> paragraph 2</i></p>"+
               "</body>";
        data = "<body><h1>asif</h1></body>";
        String html = "<p><a href='https://example.com/'>Link</a></p>";
        Document doc = Jsoup.parseBodyFragment(data);
        Element element = doc.selectFirst("h1");
        Tag tag = element.tag();
        String tagName = tag.getName();
        System.out.println(tagName);
        return Jsoup.isValid(data, safelist);
    }

    public static void myClean() {
        Safelist safe_list = Safelist.none();
//        safe_list.addTags(new String[] { "head", "body", "i"});
//        safe_list.addTags(new String[] {"body"});
        safe_list.addTags("body");
        safe_list.addTags("h1");
        String data = "<head>Title here</head>"+
                "<body>"+
                "<p><b> paragraph 1</b></p>"+
                "<p><i> paragraph 2</i></p>"+
                "</body>";
        data = "<body><h1>body</h1></body>";
        System.out.println("isvalid: "+Jsoup.isValid(data, safe_list));
        String cleaned_data = Jsoup.clean(data, safe_list);
        System.out.println("isvalid: "+Jsoup.isValid(cleaned_data, safe_list));
        System.out.println(cleaned_data);
        Document document = Jsoup.parseBodyFragment(data);
//        Jsoup.isValid()

        Document doc = Jsoup.parseBodyFragment(data);
        Element element = doc.selectFirst("h1");
        Tag tag = element.tag();
        String tagName = tag.getName();
        System.out.println("tagName: "+tagName);
    }

    static void tagNames() {
        String data = "<body>"+
                        "<div>"+
                            "<p><b> paragraph 1</b></p>"+
                            "<p><i> paragraph 2</i></p>"+
                        "</div>"+
                        "<div>"+
                        "<p><b> paragraph 1</b></p>"+
                        "<p><i> paragraph 2</i></p>"+
                        "</div>"+
                        "<div>"+
                        "<p><b> paragraph 1</b></p>"+
                        "<p><i> paragraph 2</i></p>"+
                        "</div>"+
                        "<div>"+
                        "<p><b> paragraph 1</b></p>"+
                        "<p><i> paragraph 2</i></p>"+
                        "</div>"+
                        "<div>"+
                        "<p><b> paragraph 1</b></p>"+
                        "<p><i> paragraph 2</i></p>"+
                        "</div>"+
                "<h2>Hello Heading Two</h2>"+
                "<div>" +
                    "<img src='uri'></img>" +
                    "<p>caption_attribution</p>"+
                "</div>"+
                "<p>Description paragraph 1</b></p>"+
                "</body>";
        data = "<body>"+
                    "<p>summary 1"+
                    "<h2>Hello Heading Two</h2>"+
                    "<div>" +
                        "<img src='uri'></img>" +
                        "<p>caption_attribution</p>"+
                    "</div>"+
                    "<p>Description paragraph 1</b></p>"+
                    "<h2>Hello Heading Two</h2>"+
                    "<div>" +
                    "<img src='uri'></img>" +
                    "<p>caption_attribution</p>"+
                    "</div>"+
                    "<p>Description paragraph 1</b></p>"+
                    "<h2>Hello Heading Two</h2>"+
                    "<div>" +
                    "<img src='uri'></img>" +
                    "<p>caption_attribution</p>"+
                    "</div>"+
                    "<p>Description paragraph 1</b></p>"+
                    "<h2>Hello Heading Two</h2>"+
                    "<div>" +
                    "<img src='uri'></img>" +
                    "<p>caption_attribution</p>"+
                    "</div>"+
                    "<p>Description paragraph 1</b></p>"+
                    "<p>summary 1"+
                    "<h2>Hello Heading Two</h2>"+
                    "<div>" +
                    "<img src='uri'></img>" +
                    "<p>caption_attribution</p>"+
                    "</div>"+
                    "<p>Description paragraph 1</b></p>"+
                    "<h2>Hello Heading Two</h2>"+
                    "<div>" +
                    "<img src='uri'></img>" +
                    "<p>caption_attribution</p>"+
                    "</div>"+
                    "<p>Description paragraph 1</b></p>"+
                    "<h2>Hello Heading Two</h2>"+
                    "<div>" +
                    "<img src='uri'></img>" +
                    "<p>caption_attribution</p>"+
                    "</div>"+
                    "<p>Description paragraph 1</b></p>"+
                    "<h2>Hello Heading Two</h2>"+
                    "<div>" +
                    "<img src='uri'></img>" +
                    "<p>caption_attribution</p>"+
                    "</div>"+
                    "<p>Description paragraph 1</b></p>"+
                    "<p>conclusion</p>"+
                "</body>";
        Document doc = Jsoup.parseBodyFragment(data);
        doc = Jsoup.parse(data);
        System.out.println(doc.html());
        Elements elements = doc.getAllElements();
        for (int i=4 ; i<elements.size() ; i++) {
            Tag tag = elements.get(i).tag();
            String tagName = tag.getName();
            System.out.println("tagName: " + tagName);
        }
    }
}
