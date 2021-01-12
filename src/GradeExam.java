public class GradeExam {
 public static void main(String[] args) {
     /*
      * declare a 2D array of type char and initialize it with chars that each row reflects
      * the students answers
      * */
     char[][] answers = {
             {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
             {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
             {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
             {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
             {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
             {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
             {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
             {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};

     /*
     * declare another 1D array of type char and initialize it with chars that
     * reference the key answer
     * */
     char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
     /*
      * loop to go through the entire 2D array the outer loop represents the rows [i]
      * also known as the student's answers
      * */
     for (int i = 0; i < answers.length; i++) {
         /*
          * initialize an int variable to count how many correct answers each student got
          *  after each row is complete the value of correctCount will be initialized to 0
          * */
         int correctCount = 0;
         /*
          * inner loop that represents the number of cells in each row [j]
          * that's why they end it at answers[i].length, so it iterate throw the first row
          * */
         for (int j = 0; j < answers[i].length; j++) {
             /*
              * check to see if the value of the students answers equals the value of key answers
              * and since each row of the 2D array is equal in size with the key array we can
              * just iterate through the same loop and compare them if they equal
              * we add +1 to the counter if else repeat the process till the end of row
              * */
             if (answers[i][j] == keys[j])
                 correctCount++;
                 }
         /*
          * print out the value of correctCount plus the student's number
          * starting from i = 0 to i = 7 in total of 8 students
          * after that we move on to the next student i++
          * */
         System.out.println("Student " + i + "'s correct count is " +
                 correctCount);
             }
        }
 }


