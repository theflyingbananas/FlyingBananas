package flyingbananas

class QuestionEnumerate {

   int questionNb;
   String category;
   static belongsTo = [questionnaire: Questionnaire]
    
   static constraints = {
   }
}
