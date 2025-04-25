package aulas.aula4_Arquivos_XML_Multithreading.xml;

import java.io.FileOutputStream;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

public class EscreverExemplo1 {
    public static void main(String[] args) throws Exception  {
        
        // criar objetos para um novo arquivo XML
        DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
        Document doc = docBuilder.newDocument();
        
        // nó raiz
        Element raiz = doc.createElement( "projetos_da_empresa" );
        
        doc.appendChild(raiz);
        
        // nós
        Element element1 = doc.createElement( "Projeto" );
        element1.setAttribute("nome", "Produto X");
        element1.setAttribute("Local", "Santo André");
//        element1.setTextContent( "conteudo" );
        
        Element element2 = doc.createElement( "Trabalhador" );
        element2.setAttribute("nome", "Silvia");
        element2.setAttribute("cpf", "123-123-123-12");
        element2.setTextContent( "gerente de projeto" );
        
        element1.appendChild( element2 );        
        raiz.appendChild( element1 );
        
        // salvar um novo arquivo XML
        FileOutputStream output = new FileOutputStream("./Arquivo4.xml");
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        DOMSource source = new DOMSource( doc );
        StreamResult result = new StreamResult( output );
        
        transformer.setOutputProperty( OutputKeys.OMIT_XML_DECLARATION, "yes" );
        transformer.setOutputProperty( OutputKeys.INDENT, "yes" );
        transformer.setOutputProperty(OutputKeys.ENCODING,"UTF-8");
//        transformer.setOutputProperty(OutputKeys.ENCODING,"ISO-8859-1");
        transformer.transform( source, result );
        
    }
}
