package programmers.lv1;
class q118666 {
    public String solution(String[] survey, int[] choices) {
        
        char[] cha = {'R', 'T', 'C', 'F', 'J', 'M', 'A', 'N'};
        int[] score = new int[8];
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < survey.length; i++){
            String[] cha2 = survey[i].split("");
            // System.out.println(cha2[0] + cha2[1]);
            // System.out.println(choices[i]);
            int choose = choices[i] - 4;
            // System.out.println(choose);
            if(choose < 0) {
                for(int j = 0; j < cha.length; j++){
                    
                    if(cha[j] == cha2[0].charAt(0)) {
                        score[j] += Math.abs(choose);
                        // System.out.println(">>>>>>>>>>>>" + cha[j]);
                                                    }
                }
            }else{
                for(int j = 0; j < cha.length; j++){
                    
                    if(cha[j] == cha2[1].charAt(0)) score[j] += Math.abs(choose);
                }
            }
        }
        
        for(int i = 0; i < score.length; i+=2){
            if(score[i] == score[i+1]){
                // System.out.println("같음" + " | " + cha[i] + " | " + cha[i+1]);
                sb.append(cha[i] - cha[i+1] < 0 ? Character.toString(cha[i]) : Character.toString(cha[i+1]));
            }else{
                // System.out.println("다름" + " | " + score[i] + " | " + score[i+1]);
                
                sb.append(score[i] - score[i+1] > 0 ? Character.toString(cha[i]) : Character.toString(cha[i+1]));
            }
        }
        
        return sb.toString();
    }
}