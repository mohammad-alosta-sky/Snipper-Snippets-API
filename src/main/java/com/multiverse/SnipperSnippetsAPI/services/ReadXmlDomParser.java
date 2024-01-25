package com.multiverse.SnipperSnippetsAPI.services;


import com.multiverse.SnipperSnippetsAPI.models.SnippetModel;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import org.w3c.dom.Document;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;


public class ReadXmlDomParser {
    static File file = new File("src/main/resources/xml/seedDate.xml");


    public static ArrayList<SnippetModel> seed() throws ParserConfigurationException {

        ArrayList<SnippetModel> snippetsList = new ArrayList<>();

        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();
        try {
            Document doc = db.parse(file);
            NodeList snippetList = doc.getElementsByTagName("snippet");
            for (int i = 0; i < snippetList.getLength(); i++) {
                Element snippet = (Element) snippetList.item(i);
                snippetsList.add(new SnippetModel(
                        Integer.valueOf(snippet.getElementsByTagName("id").item(0).getTextContent()),
                        snippet.getElementsByTagName("language").item(0).getTextContent(),
                        snippet.getElementsByTagName("code").item(0).getTextContent()
                ));

            }

//            System.out.println(snippetsList);

        } catch (SAXException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return snippetsList;

    }
}
