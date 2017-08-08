package com.asd_soft.assaduzzaman_noor.kidsmath;

import java.util.Random;

/**
 * Created by Assaduzzaman Noor on 1/9/2017.
 */

public class AI {
    private String[] eqn= new String[100];
    private String[] ans= new String[100];
    private int[] is_true= new int[100];
    private String[] eqn2= new String[100];
    private String[] ans2= new String[100];
    private int[] is_true2= new int[100];
    private int[] rand_one= new int[100];
    private int[] rand_two=new int[100];
    private int[] r_one= new int[100];
    private int[] r_two=new int[100];
    private int set_one_counter;
    private int set_two_counter;




    public AI() {
        set_one_counter=0;
        set_two_counter=0;
        set_one();
        set_two();
        for (int i=0; i<50; i++){
            r_one[i]=0;
            r_two[i]=0;
        }
        set_rand();
    }

    void set_rand(){
        int c=0;
        while (c<45){
            int r_num=randInt(0,45);
            if(r_one[r_num]==0){
                r_one[r_num]=1;
                rand_one[c]=r_num;
                c++;
            }
        }
        c=0;
        while (c<35){
            int r_num=randInt(0,35);
            if(r_two[r_num]==0){
                r_two[r_num]=1;
                rand_two[c]=r_num;
                c++;
            }
        }
    }



    public void setSet_one_counter() {
        set_one_counter++;
    }

    public void setSet_two_counter() {
        set_two_counter++;
    }

    public String getEqn() {
        return eqn[rand_one[set_one_counter]];
    }

    public String getAns() {
        return ans[rand_one[set_one_counter]];
    }

    public int getIs_true() {
        return is_true[rand_one[set_one_counter]];
    }

    public String getEqn2() {
        return eqn2[rand_two[set_two_counter]];
    }

    public String getAns2() {
        return ans2[rand_two[set_two_counter]];
    }

    public int getIs_true2() {
        return is_true2[rand_two[set_two_counter]];
    }

    public static int randInt(int min, int max) {
        Random rand= new Random();;
        int randomNum = rand.nextInt((max - min) + 1) + min;
        return randomNum;
    }


    void set_one(){
        eqn[0]="3 + 3";
        ans[0]="= 9";
        is_true[0]=0;
        eqn[1]="2 + 3";
        ans[1]="= 5";
        is_true[1]=1;
        eqn[2]="2 + 3";
        ans[2]="= 6";
        is_true[2]=0;
        eqn[3]="3 + 3";
        ans[3]="= 6";
        is_true[3]=1;
        eqn[4]="3 + 7";
        ans[4]="= 9";
        is_true[4]=0;
        eqn[5]="1 + 2";
        ans[5]="= 5";
        is_true[5]=0;
        eqn[6]="1 + 2";
        ans[6]="= 3";
        is_true[6]=1;
        eqn[7]="2 + 2";
        ans[7]="= 4";
        is_true[7]=1;
        eqn[8]="2 + 2";
        ans[8]="= 6";
        is_true[8]=0;
        eqn[9]="1 + 3";
        ans[9]="= 5";
        is_true[9]=0;
        eqn[10]="1 + 3";
        ans[10]="= 4";
        is_true[10]=1;
        eqn[11]="5 + 4";
        ans[11]="= 7";
        is_true[11]=0;
        eqn[12]="5 + 4";
        ans[12]="= 9";
        is_true[12]=1;
        eqn[13]="7 + 3";
        ans[13]="= 10";
        is_true[13]=1;
        eqn[14]="5 + 5";
        ans[14]="= 10";
        is_true[14]=1;
        eqn[15]="4 + 1";
        ans[15]="= 6";
        is_true[15]=0;
        eqn[16]="4 + 1";
        ans[16]="= 5";
        is_true[16]=1;
        eqn[17]="4 + 3";
        ans[17]="= 6";
        is_true[17]=0;
        eqn[18]="4 + 3";
        ans[18]="= 7";
        is_true[18]=1;
        eqn[19]="4 + 3";
        ans[19]="= 9";
        is_true[19]=0;
        eqn[20]="6 + 1";
        ans[20]="= 7";
        is_true[20]=1;
        eqn[21]="1 + 1";
        ans[21]="= 2";
        is_true[21]=1;
        eqn[22]="7 + 1";
        ans[22]="= 8";
        is_true[22]=1;
        eqn[23]="5 + 3";
        ans[23]="= 8";
        is_true[23]=1;
        eqn[24]="5 + 3";
        ans[24]="= 9";
        is_true[24]=0;
        eqn[25]="5 + 3";
        ans[25]="= 8";
        is_true[25]=1;
        eqn[26]="5 + 6";
        ans[26]="= 11";
        is_true[26]=1;
        eqn[27]="5 + 6";
        ans[27]="= 13";
        is_true[27]=0;
        eqn[28]="10 + 10";
        ans[28]="= 20";
        is_true[28]=1;
        eqn[29]="12 + 12";
        ans[29]="= 24";
        is_true[29]=1;
        eqn[30]="7 + 2";
        ans[30]="= 9";
        is_true[30]=1;
        eqn[31]="7 + 2";
        ans[31]="= 11";
        is_true[31]=0;
        eqn[32]="6 + 2";
        ans[32]="= 9";
        is_true[32]=0;
        eqn[33]="7 + 4";
        ans[33]="= 11";
        is_true[33]=1;
        eqn[34]="7 + 4";
        ans[34]="= 12";
        is_true[34]=0;
        eqn[35]="1 + 9";
        ans[35]="= 10";
        is_true[35]=1;
        eqn[36]="4 + 6";
        ans[36]="= 9";
        is_true[36]=0;
        eqn[37]="4 + 4";
        ans[37]="= 8";
        is_true[37]=1;
        eqn[38]="7 + 7";
        ans[38]="= 14";
        is_true[38]=1;
        eqn[39]="8 + 8";
        ans[39]="= 16";
        is_true[39]=1;
        eqn[40]="9 + 9";
        ans[40]="= 18";
        is_true[40]=1;
        eqn[41]="6 + 6";
        ans[41]="= 12";
        is_true[41]=1;
        eqn[42]="7 + 7";
        ans[42]="= 12";
        is_true[42]=0;
        eqn[43]="8 + 8";
        ans[43]="= 14";
        is_true[43]=0;
        eqn[44]="9 + 7";
        ans[44]="= 16";
        is_true[44]=1;
        eqn[45]="6 + 6";
        ans[45]="= 14";
        is_true[45]=0;
        eqn[46]="4 + 4";
        ans[46]="= 8";
        is_true[46]=1;

    }

    void set_two(){
        eqn2[0]="13 + 13";
        ans2[0]="= 26";
        is_true2[0]=1;
        eqn2[1]="13 + 13";
        ans2[1]="= 29";
        is_true2[1]=0;
        eqn2[2]="13 - 6";
        ans2[2]="= 7";
        is_true2[2]=1;
        eqn2[3]="13 - 6";
        ans2[3]="= 9";
        is_true2[0]=0;
        eqn2[3]="13 + 9";
        ans2[3]="= 26";
        is_true2[3]=0;
        eqn2[4]="13 + 9";
        ans2[4]="= 22";
        is_true2[4]=1;
        eqn2[5]="13 - 9";
        ans2[5]="= 4";
        is_true2[5]=1;
        eqn2[6]="23 - 6";
        ans2[6]="= 19";
        is_true2[6]=0;
        eqn2[7]="23 - 6";
        ans2[7]="= 17";
        is_true2[7]=1;
        eqn2[8]="23 + 3";
        ans2[8]="= 29";
        is_true2[8]=0;
        eqn2[9]="23 - 1";
        ans2[9]="= 24";
        is_true2[9]=0;
        eqn2[10]="23 - 7";
        ans2[10]="= 16";
        is_true2[10]=1;
        eqn2[11]="23 - 12";
        ans2[11]="= 11";
        is_true2[11]=1;
        eqn2[12]="15 + 13";
        ans2[12]="= 28";
        is_true2[12]=1;
        eqn2[14]="25 + 3";
        ans2[14]="= 28";
        is_true2[14]=1;
        eqn2[15]="35 + 7";
        ans2[15]="= 42";
        is_true2[15]=1;
        eqn2[16]="35 + 9";
        ans2[16]="= 42";
        is_true2[16]=0;
        eqn2[17]="35 + 17";
        ans2[17]="= 53";
        is_true2[17]=0;
        eqn2[18]="63 + 23";
        ans2[18]="= 89";
        is_true2[18]=0;
        eqn2[19]="63 + 19";
        ans2[19]="= 82";
        is_true2[19]=1;
        eqn2[20]="49 + 39";
        ans2[20]="= 78";
        is_true2[20]=0;
        eqn2[21]="29 + 49";
        ans2[21]="= 78";
        is_true2[21]=1;
        eqn2[22]="27 + 37";
        ans2[22]="= 64";
        is_true2[22]=1;
        eqn2[23]="47 + 17";
        ans2[23]="= 64";
        is_true2[23]=1;
        eqn2[24]="27 + 23";
        ans2[24]="= 40";
        is_true2[24]=0;
        eqn2[25]="45 + 23";
        ans2[25]="= 86";
        is_true2[25]=0;
        eqn2[26]="45 + 33";
        ans2[26]="= 79";
        is_true2[26]=0;
        eqn2[27]="45 + 23";
        ans2[27]="= 68";
        is_true2[27]=1;
        eqn2[13]="69 + 7";
        ans2[13]="= 76";
        is_true2[13]=1;
        eqn2[28]="21 + 39";
        ans2[28]="= 50";
        is_true2[28]=0;
        eqn2[29]="21 + 39";
        ans2[29]="= 60";
        is_true2[29]=1;
        eqn2[30]="39 + 39";
        ans2[30]="= 78";
        is_true2[30]=1;
        eqn2[31]="75 + 15";
        ans2[31]="= 90";
        is_true2[31]=1;
        eqn2[32]="84 + 15";
        ans2[32]="= 97";
        is_true2[32]=0;
        eqn2[33]="45 + 25";
        ans2[33]="= 70";
        is_true2[33]=1;
        eqn2[34]="85 - 16";
        ans2[34]="= 69";
        is_true2[34]=1;
        eqn2[35]="77 + 11";
        ans2[35]="= 89";
        is_true2[35]=0;
        eqn2[36]="47 + 24";
        ans2[36]="= 69";
        is_true2[36]=0;

    }




}
