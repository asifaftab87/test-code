package org.la.test.jsoop;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class HtmlStringToProto {
    public static void main(String[] args) {
        String s = "<p>First Summary</p><h2>1 title</h2><div><img src=\"uri-1\" /><p><a>caption-1</a></p></div><p>First Paragraph</p>\n" +
                "<h2>2 title</h2><div><img src=\"uri-2\" /><p><a>caption-2</a></p></div><p>second Paragraph</p>\n" +
                "<h2>3 title</h2><div><img src=\"uri-3\" /><p><a>caption-3</a></p></div><p>third Paragraph</p>\n" +
                "<p>second Summary</p><h2>4 title</h2><div><img src=\"uri-4\" /><p><a>caption-4</a></p></div><p>fourth Paragraph</p>\n" +
                "<h2>5 title</h2><div><img src=\"uri-5\" /><p><a>caption-5</a></p></div><p>fifth Paragraph</p>\n" +
                "<h2>6 title</h2><div><img src=\"uri-6\" /><p><a>caption-6</a></p></div><p>sixth Paragraph</p>\n" +
                "<p>Conclusion</p>";
        Document document = Jsoup.parse(s);
        Element body = document.selectFirst("body");
        Elements children = body.children();
        boolean isSummary = true;
        Element h2Element = null;
        int i=0;
        if (children!=null && children.size()>0) {
            for (i = 0; i < children.size() - 1; i++) {
                Element child = children.get(i);
                //i++;
                if (child != null) {
                    Element sibling = child.nextElementSibling();
                    i++;
                    if (isSummary) {
                        StringBuilder sb = new StringBuilder(child.html());
                        while (sibling != null && sibling.tag() != null
                                && sibling.tag().getName().equalsIgnoreCase("p")) {
                            sb.append("\n").append(sibling.html());
                            sibling = sibling.nextElementSibling();
                            i++;
                        }
                        System.out.println("sb: " + sb.toString());
                        isSummary = false;
                        h2Element = sibling;
                        i++;
                    } else {
                        h2Element = child;
                        //i++;
                    }
                    if (h2Element != null) {
                        String title = h2Element.html();
                        System.out.println("title: " + title);
                        Element divElement = h2Element.nextElementSibling();
                        i++;
                        if (divElement != null) {
                            Element imgElement = divElement.selectFirst("img");
                            if (imgElement != null) {
                                String uri = imgElement.attr("src");
                                System.out.println("uri: " + uri);
                            }
                            Element captionAttachmentElement = divElement.selectFirst("p");
                            if (captionAttachmentElement != null) {
                                String captionAttachment;
                                if (captionAttachmentElement.children() != null
                                        && captionAttachmentElement.children().size() > 0) {
                                    captionAttachment = captionAttachmentElement.child(0).html();
                                } else {
                                    captionAttachment = captionAttachmentElement.html();
                                }
                                System.out.println("captionAttachment: " + captionAttachment);
                            }
                            Element descriptionElement = divElement.nextElementSibling();
                            if (descriptionElement != null) {
                                String description = descriptionElement.html();
                                System.out.println("description: " + description);
                                Element testElement = descriptionElement.nextElementSibling();
                                if (testElement!=null
                                    && testElement.tag().getName().equalsIgnoreCase("p")) {
                                    isSummary = true;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (i<children.size()) {
            Element conclusionElement = children.get(i);
            if (conclusionElement != null) {
                String conclusion = conclusionElement.html();
                System.out.println("conclusion: " + conclusion);
            }
        }
    }
}
