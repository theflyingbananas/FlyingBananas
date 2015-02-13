package flyingbananas

import java.text.ParsePosition
import java.text.SimpleDateFormat

class Questionnaire {
	
	String professor
	String subject
	String type
	String deadline
	static hasMany = [questionsEnumerate : QuestionEnumerate, questionsString : QuestionString]
	
	static constraints = {
		professor(blank: false)
		subject(blank: false, maxSize: 50)
		type(inList: ["Simple", "Detailed"])
		deadline(blank: false, validator:{v ->
			def df=new SimpleDateFormat('dd/MM/yyyy')
			df.lenient=false
			return df.parse(v, new ParsePosition(0)) ? true :false
		} )
	}
	
	String toString() {
		return "${professor}, ${subject}, ${type})"
	}
}
