//package com.multiverse.SnipperSnippetsAPI.services;
//
//
//import org.xml.sax.SAXException;
//
//import org.w3c.dom.Document;
//import javax.xml.parsers.DocumentBuilder;
//import javax.xml.parsers.DocumentBuilderFactory;
//import javax.xml.parsers.ParserConfigurationException;
//import java.io.File;
//import java.io.IOException;
//
//
//public class ReadXmlDomParser {
////    File file = new File("../../../resources/xml/seedDate.xml");
//
//
//    public static void main(String[] args) throws ParserConfigurationException {
//
//        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
//        DocumentBuilder db = dbf.newDocumentBuilder();
//        try {
//            Document doc = db.parse(new File("src/main/resources/xml/seedDate.xml"));
//            System.out.println(doc.getDocumentElement().getNodeName());
//        } catch (SAXException e) {
//            throw new RuntimeException(e);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//
//    }
//}
