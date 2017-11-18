package XMLparshing;

import java.io.File;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
 
public class XmlToObject {
	public static void main(String[] args) {
 
	 try {
 
		File file = new File("src/XMLparshing/question.xml");
		JAXBContext jaxbContext = JAXBContext.newInstance(Question.class);
 
		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		Question que= (Question) jaxbUnmarshaller.unmarshal(file);
		
		System.out.println(que.getId()+" "+que.getQuestionname());
		System.out.println("Answers:");
		List<Answer> list=que.getAnswers();
		for(Answer ans:list)
		  System.out.println(ans.getId()+" "+ans.getAnswername()+"  "+ans.getPostedby());
 
	  } catch (JAXBException e) {
		  System.out.println("file not found");
		e.printStackTrace();
	  }
 
	}
}