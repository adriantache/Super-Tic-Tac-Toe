package com.adriantache.supertictactoe;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    //declare all 81 button views
    Button button11;
    Button button12;
    Button button13;
    Button button14;
    Button button15;
    Button button16;
    Button button17;
    Button button18;
    Button button19;
    Button button21;
    Button button22;
    Button button23;
    Button button24;
    Button button25;
    Button button26;
    Button button27;
    Button button28;
    Button button29;
    Button button31;
    Button button32;
    Button button33;
    Button button34;
    Button button35;
    Button button36;
    Button button37;
    Button button38;
    Button button39;
    Button button41;
    Button button42;
    Button button43;
    Button button44;
    Button button45;
    Button button46;
    Button button47;
    Button button48;
    Button button49;
    Button button51;
    Button button52;
    Button button53;
    Button button54;
    Button button55;
    Button button56;
    Button button57;
    Button button58;
    Button button59;
    Button button61;
    Button button62;
    Button button63;
    Button button64;
    Button button65;
    Button button66;
    Button button67;
    Button button68;
    Button button69;
    Button button71;
    Button button72;
    Button button73;
    Button button74;
    Button button75;
    Button button76;
    Button button77;
    Button button78;
    Button button79;
    Button button81;
    Button button82;
    Button button83;
    Button button84;
    Button button85;
    Button button86;
    Button button87;
    Button button88;
    Button button89;
    Button button91;
    Button button92;
    Button button93;
    Button button94;
    Button button95;
    Button button96;
    Button button97;
    Button button98;
    Button button99;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //find all 81 button views
        button11 = findViewById(R.id.button11);
        button12 = findViewById(R.id.button12);
        button13 = findViewById(R.id.button13);
        button14 = findViewById(R.id.button14);
        button15 = findViewById(R.id.button15);
        button16 = findViewById(R.id.button16);
        button17 = findViewById(R.id.button17);
        button18 = findViewById(R.id.button18);
        button19 = findViewById(R.id.button19);
        button21 = findViewById(R.id.button21);
        button22 = findViewById(R.id.button22);
        button23 = findViewById(R.id.button23);
        button24 = findViewById(R.id.button24);
        button25 = findViewById(R.id.button25);
        button26 = findViewById(R.id.button26);
        button27 = findViewById(R.id.button27);
        button28 = findViewById(R.id.button28);
        button29 = findViewById(R.id.button29);
        button31 = findViewById(R.id.button31);
        button32 = findViewById(R.id.button32);
        button33 = findViewById(R.id.button33);
        button34 = findViewById(R.id.button34);
        button35 = findViewById(R.id.button35);
        button36 = findViewById(R.id.button36);
        button37 = findViewById(R.id.button37);
        button38 = findViewById(R.id.button38);
        button39 = findViewById(R.id.button39);
        button41 = findViewById(R.id.button41);
        button42 = findViewById(R.id.button42);
        button43 = findViewById(R.id.button43);
        button44 = findViewById(R.id.button44);
        button45 = findViewById(R.id.button45);
        button46 = findViewById(R.id.button46);
        button47 = findViewById(R.id.button47);
        button48 = findViewById(R.id.button48);
        button49 = findViewById(R.id.button49);
        button51 = findViewById(R.id.button51);
        button52 = findViewById(R.id.button52);
        button53 = findViewById(R.id.button53);
        button54 = findViewById(R.id.button54);
        button55 = findViewById(R.id.button55);
        button56 = findViewById(R.id.button56);
        button57 = findViewById(R.id.button57);
        button58 = findViewById(R.id.button58);
        button59 = findViewById(R.id.button59);
        button61 = findViewById(R.id.button61);
        button62 = findViewById(R.id.button62);
        button63 = findViewById(R.id.button63);
        button64 = findViewById(R.id.button64);
        button65 = findViewById(R.id.button65);
        button66 = findViewById(R.id.button66);
        button67 = findViewById(R.id.button67);
        button68 = findViewById(R.id.button68);
        button69 = findViewById(R.id.button69);
        button71 = findViewById(R.id.button71);
        button72 = findViewById(R.id.button72);
        button73 = findViewById(R.id.button73);
        button74 = findViewById(R.id.button74);
        button75 = findViewById(R.id.button75);
        button76 = findViewById(R.id.button76);
        button77 = findViewById(R.id.button77);
        button78 = findViewById(R.id.button78);
        button79 = findViewById(R.id.button79);
        button81 = findViewById(R.id.button81);
        button82 = findViewById(R.id.button82);
        button83 = findViewById(R.id.button83);
        button84 = findViewById(R.id.button84);
        button85 = findViewById(R.id.button85);
        button86 = findViewById(R.id.button86);
        button87 = findViewById(R.id.button87);
        button88 = findViewById(R.id.button88);
        button89 = findViewById(R.id.button89);
        button91 = findViewById(R.id.button91);
        button92 = findViewById(R.id.button92);
        button93 = findViewById(R.id.button93);
        button94 = findViewById(R.id.button94);
        button95 = findViewById(R.id.button95);
        button96 = findViewById(R.id.button96);
        button97 = findViewById(R.id.button97);
        button98 = findViewById(R.id.button98);
        button99 = findViewById(R.id.button99);

    }

    //declare all matrix
    int[][] game1 = new int[3][3];
    int[][] game2 = new int[3][3];
    int[][] game3 = new int[3][3];
    int[][] game4 = new int[3][3];
    int[][] game5 = new int[3][3];
    int[][] game6 = new int[3][3];
    int[][] game7 = new int[3][3];
    int[][] game8 = new int[3][3];
    int[][] game9 = new int[3][3];
    int[][] mainGame = new int[3][3];

    //declare variables
    int currentPlayer = 1;

    public void reset(View view) {
        //todo implement reset functionality
        return;
    }

    //all 81 methods for the individual buttons
    public void button11(View view) {
        game1[1][1] = currentPlayer;
        button11.setEnabled(false);
        activeGame1();
    }

    public void button12(View view) {
        game1[1][2] = currentPlayer;
        button12.setEnabled(false);
        activeGame2();
    }

    public void button13(View view) {
        game1[1][3] = currentPlayer;
        button13.setEnabled(false);
        activeGame3();
    }

    public void button14(View view) {
        game2[2][1] = currentPlayer;
        button14.setEnabled(false);
        activeGame1();
    }

    public void button15(View view) {
        game2[2][2] = currentPlayer;
        button15.setEnabled(false);
        activeGame2();
    }

    public void button16(View view) {
        game2[2][3] = currentPlayer;
        button16.setEnabled(false);
        activeGame3();
    }

    public void button17(View view) {
        game3[3][1] = currentPlayer;
        button17.setEnabled(false);
        activeGame1();
    }

    public void button18(View view) {
        game3[3][2] = currentPlayer;
        button18.setEnabled(false);
        activeGame2();
    }

    public void button19(View view) {
        game3[3][3] = currentPlayer;
        button19.setEnabled(false);
        activeGame3();
    }

    public void button21(View view) {
        game1[1][4] = currentPlayer;
        button21.setEnabled(false);
        activeGame4();
    }

    public void button22(View view) {
        game1[1][5] = currentPlayer;
        button22.setEnabled(false);
        activeGame5();
    }

    public void button23(View view) {
        game1[1][6] = currentPlayer;
        button23.setEnabled(false);
        activeGame6();
    }

    public void button24(View view) {
        game2[2][4] = currentPlayer;
        button24.setEnabled(false);
        activeGame4();
    }

    public void button25(View view) {
        game2[2][5] = currentPlayer;
        button25.setEnabled(false);
        activeGame5();
    }

    public void button26(View view) {
        game2[2][6] = currentPlayer;
        button26.setEnabled(false);
        activeGame6();
    }

    public void button27(View view) {
        game3[3][4] = currentPlayer;
        button27.setEnabled(false);
        activeGame4();
    }

    public void button28(View view) {
        game3[3][5] = currentPlayer;
        button28.setEnabled(false);
        activeGame5();
    }

    public void button29(View view) {
        game3[3][6] = currentPlayer;
        button29.setEnabled(false);
        activeGame6();
    }

    public void button31(View view) {
        game1[1][7] = currentPlayer;
        button31.setEnabled(false);
        activeGame7();
    }

    public void button32(View view) {
        game1[1][8] = currentPlayer;
        button32.setEnabled(false);
        activeGame8();
    }

    public void button33(View view) {
        game1[1][9] = currentPlayer;
        button33.setEnabled(false);
        activeGame9();
    }

    public void button34(View view) {
        game2[2][7] = currentPlayer;
        button34.setEnabled(false);
        activeGame7();
    }

    public void button35(View view) {
        game2[2][8] = currentPlayer;
        button35.setEnabled(false);
        activeGame8();
    }

    public void button36(View view) {
        game2[2][9] = currentPlayer;
        button36.setEnabled(false);
        activeGame9();
    }

    public void button37(View view) {
        game3[3][7] = currentPlayer;
        button37.setEnabled(false);
        activeGame7();
    }

    public void button38(View view) {
        game3[3][8] = currentPlayer;
        button38.setEnabled(false);
        activeGame8();
    }

    public void button39(View view) {
        game3[3][9] = currentPlayer;
        button39.setEnabled(false);
        activeGame9();
    }

    public void button41(View view) {
        game4[4][1] = currentPlayer;
        button41.setEnabled(false);
        activeGame1();
    }

    public void button42(View view) {
        game4[4][2] = currentPlayer;
        button42.setEnabled(false);
        activeGame2();
    }

    public void button43(View view) {
        game4[4][3] = currentPlayer;
        button43.setEnabled(false);
        activeGame3();
    }

    public void button44(View view) {
        game5[5][1] = currentPlayer;
        button44.setEnabled(false);
        activeGame1();
    }

    public void button45(View view) {
        game5[5][2] = currentPlayer;
        button45.setEnabled(false);
        activeGame2();
    }

    public void button46(View view) {
        game5[5][3] = currentPlayer;
        button46.setEnabled(false);
        activeGame3();
    }

    public void button47(View view) {
        game6[6][1] = currentPlayer;
        button47.setEnabled(false);
        activeGame1();
    }

    public void button48(View view) {
        game6[6][2] = currentPlayer;
        button48.setEnabled(false);
        activeGame2();
    }

    public void button49(View view) {
        game6[6][3] = currentPlayer;
        button49.setEnabled(false);
        activeGame3();
    }

    public void button51(View view) {
        game4[4][4] = currentPlayer;
        button51.setEnabled(false);
        activeGame4();
    }

    public void button52(View view) {
        game4[4][5] = currentPlayer;
        button52.setEnabled(false);
        activeGame5();
    }

    public void button53(View view) {
        game4[4][6] = currentPlayer;
        button53.setEnabled(false);
        activeGame6();
    }

    public void button54(View view) {
        game5[5][4] = currentPlayer;
        button54.setEnabled(false);
        activeGame4();
    }

    public void button55(View view) {
        game5[5][5] = currentPlayer;
        button55.setEnabled(false);
        activeGame5();
    }

    public void button56(View view) {
        game5[5][6] = currentPlayer;
        button56.setEnabled(false);
        activeGame6();
    }

    public void button57(View view) {
        game6[6][4] = currentPlayer;
        button57.setEnabled(false);
        activeGame4();
    }

    public void button58(View view) {
        game6[6][5] = currentPlayer;
        button58.setEnabled(false);
        activeGame5();
    }

    public void button59(View view) {
        game6[6][6] = currentPlayer;
        button59.setEnabled(false);
        activeGame6();
    }

    public void button61(View view) {
        game4[4][7] = currentPlayer;
        button61.setEnabled(false);
        activeGame7();
    }

    public void button62(View view) {
        game4[4][8] = currentPlayer;
        button62.setEnabled(false);
        activeGame8();
    }

    public void button63(View view) {
        game4[4][9] = currentPlayer;
        button63.setEnabled(false);
        activeGame9();
    }

    public void button64(View view) {
        game5[5][7] = currentPlayer;
        button64.setEnabled(false);
        activeGame7();
    }

    public void button65(View view) {
        game5[5][8] = currentPlayer;
        button65.setEnabled(false);
        activeGame8();
    }

    public void button66(View view) {
        game5[5][9] = currentPlayer;
        button66.setEnabled(false);
        activeGame9();
    }

    public void button67(View view) {
        game6[6][7] = currentPlayer;
        button67.setEnabled(false);
        activeGame7();
    }

    public void button68(View view) {
        game6[6][8] = currentPlayer;
        button68.setEnabled(false);
        activeGame8();
    }

    public void button69(View view) {
        game6[6][9] = currentPlayer;
        button69.setEnabled(false);
        activeGame9();
    }

    public void button71(View view) {
        game7[7][1] = currentPlayer;
        button71.setEnabled(false);
        activeGame1();
    }

    public void button72(View view) {
        game7[7][2] = currentPlayer;
        button72.setEnabled(false);
        activeGame2();
    }

    public void button73(View view) {
        game7[7][3] = currentPlayer;
        button73.setEnabled(false);
        activeGame3();
    }

    public void button74(View view) {
        game8[8][1] = currentPlayer;
        button74.setEnabled(false);
        activeGame1();
    }

    public void button75(View view) {
        game8[8][2] = currentPlayer;
        button75.setEnabled(false);
        activeGame2();
    }

    public void button76(View view) {
        game8[8][3] = currentPlayer;
        button76.setEnabled(false);
        activeGame3();
    }

    public void button77(View view) {
        game9[9][1] = currentPlayer;
        button77.setEnabled(false);
        activeGame1();
    }

    public void button78(View view) {
        game9[9][2] = currentPlayer;
        button78.setEnabled(false);
        activeGame2();
    }

    public void button79(View view) {
        game9[9][3] = currentPlayer;
        button79.setEnabled(false);
        activeGame3();
    }

    public void button81(View view) {
        game7[7][4] = currentPlayer;
        button81.setEnabled(false);
        activeGame4();
    }

    public void button82(View view) {
        game7[7][5] = currentPlayer;
        button82.setEnabled(false);
        activeGame5();
    }

    public void button83(View view) {
        game7[7][6] = currentPlayer;
        button83.setEnabled(false);
        activeGame6();
    }

    public void button84(View view) {
        game8[8][4] = currentPlayer;
        button84.setEnabled(false);
        activeGame4();
    }

    public void button85(View view) {
        game8[8][5] = currentPlayer;
        button85.setEnabled(false);
        activeGame5();
    }

    public void button86(View view) {
        game8[8][6] = currentPlayer;
        button86.setEnabled(false);
        activeGame6();
    }

    public void button87(View view) {
        game9[9][4] = currentPlayer;
        button87.setEnabled(false);
        activeGame4();
    }

    public void button88(View view) {
        game9[9][5] = currentPlayer;
        button88.setEnabled(false);
        activeGame5();
    }

    public void button89(View view) {
        game9[9][6] = currentPlayer;
        button89.setEnabled(false);
        activeGame6();
    }

    public void button91(View view) {
        game7[7][7] = currentPlayer;
        button91.setEnabled(false);
        activeGame7();
    }

    public void button92(View view) {
        game7[7][8] = currentPlayer;
        button92.setEnabled(false);
        activeGame8();
    }

    public void button93(View view) {
        game7[7][9] = currentPlayer;
        button93.setEnabled(false);
        activeGame9();
    }

    public void button94(View view) {
        game8[8][7] = currentPlayer;
        button94.setEnabled(false);
        activeGame7();
    }

    public void button95(View view) {
        game8[8][8] = currentPlayer;
        button95.setEnabled(false);
        activeGame8();
    }

    public void button96(View view) {
        game8[8][9] = currentPlayer;
        button96.setEnabled(false);
        activeGame9();
    }

    public void button97(View view) {
        game9[9][7] = currentPlayer;
        button97.setEnabled(false);
        activeGame7();
    }

    public void button98(View view) {
        game9[9][8] = currentPlayer;
        button98.setEnabled(false);
        activeGame8();
    }

    public void button99(View view) {
        game9[9][9] = currentPlayer;
        button99.setEnabled(false);
        activeGame9();
    }

    //method to remove highlighting
    private void resetAllButtons() {
        button11.setBackgroundResource(android.R.drawable.btn_default);
        button12.setBackgroundResource(android.R.drawable.btn_default);
        button13.setBackgroundResource(android.R.drawable.btn_default);
        button14.setBackgroundResource(android.R.drawable.btn_default);
        button15.setBackgroundResource(android.R.drawable.btn_default);
        button16.setBackgroundResource(android.R.drawable.btn_default);
        button17.setBackgroundResource(android.R.drawable.btn_default);
        button18.setBackgroundResource(android.R.drawable.btn_default);
        button19.setBackgroundResource(android.R.drawable.btn_default);
        button21.setBackgroundResource(android.R.drawable.btn_default);
        button22.setBackgroundResource(android.R.drawable.btn_default);
        button23.setBackgroundResource(android.R.drawable.btn_default);
        button24.setBackgroundResource(android.R.drawable.btn_default);
        button25.setBackgroundResource(android.R.drawable.btn_default);
        button26.setBackgroundResource(android.R.drawable.btn_default);
        button27.setBackgroundResource(android.R.drawable.btn_default);
        button28.setBackgroundResource(android.R.drawable.btn_default);
        button29.setBackgroundResource(android.R.drawable.btn_default);
        button31.setBackgroundResource(android.R.drawable.btn_default);
        button32.setBackgroundResource(android.R.drawable.btn_default);
        button33.setBackgroundResource(android.R.drawable.btn_default);
        button34.setBackgroundResource(android.R.drawable.btn_default);
        button35.setBackgroundResource(android.R.drawable.btn_default);
        button36.setBackgroundResource(android.R.drawable.btn_default);
        button37.setBackgroundResource(android.R.drawable.btn_default);
        button38.setBackgroundResource(android.R.drawable.btn_default);
        button39.setBackgroundResource(android.R.drawable.btn_default);
        button41.setBackgroundResource(android.R.drawable.btn_default);
        button42.setBackgroundResource(android.R.drawable.btn_default);
        button43.setBackgroundResource(android.R.drawable.btn_default);
        button44.setBackgroundResource(android.R.drawable.btn_default);
        button45.setBackgroundResource(android.R.drawable.btn_default);
        button46.setBackgroundResource(android.R.drawable.btn_default);
        button47.setBackgroundResource(android.R.drawable.btn_default);
        button48.setBackgroundResource(android.R.drawable.btn_default);
        button49.setBackgroundResource(android.R.drawable.btn_default);
        button51.setBackgroundResource(android.R.drawable.btn_default);
        button52.setBackgroundResource(android.R.drawable.btn_default);
        button53.setBackgroundResource(android.R.drawable.btn_default);
        button54.setBackgroundResource(android.R.drawable.btn_default);
        button55.setBackgroundResource(android.R.drawable.btn_default);
        button56.setBackgroundResource(android.R.drawable.btn_default);
        button57.setBackgroundResource(android.R.drawable.btn_default);
        button58.setBackgroundResource(android.R.drawable.btn_default);
        button59.setBackgroundResource(android.R.drawable.btn_default);
        button61.setBackgroundResource(android.R.drawable.btn_default);
        button62.setBackgroundResource(android.R.drawable.btn_default);
        button63.setBackgroundResource(android.R.drawable.btn_default);
        button64.setBackgroundResource(android.R.drawable.btn_default);
        button65.setBackgroundResource(android.R.drawable.btn_default);
        button66.setBackgroundResource(android.R.drawable.btn_default);
        button67.setBackgroundResource(android.R.drawable.btn_default);
        button68.setBackgroundResource(android.R.drawable.btn_default);
        button69.setBackgroundResource(android.R.drawable.btn_default);
        button71.setBackgroundResource(android.R.drawable.btn_default);
        button72.setBackgroundResource(android.R.drawable.btn_default);
        button73.setBackgroundResource(android.R.drawable.btn_default);
        button74.setBackgroundResource(android.R.drawable.btn_default);
        button75.setBackgroundResource(android.R.drawable.btn_default);
        button76.setBackgroundResource(android.R.drawable.btn_default);
        button77.setBackgroundResource(android.R.drawable.btn_default);
        button78.setBackgroundResource(android.R.drawable.btn_default);
        button79.setBackgroundResource(android.R.drawable.btn_default);
        button81.setBackgroundResource(android.R.drawable.btn_default);
        button82.setBackgroundResource(android.R.drawable.btn_default);
        button83.setBackgroundResource(android.R.drawable.btn_default);
        button84.setBackgroundResource(android.R.drawable.btn_default);
        button85.setBackgroundResource(android.R.drawable.btn_default);
        button86.setBackgroundResource(android.R.drawable.btn_default);
        button87.setBackgroundResource(android.R.drawable.btn_default);
        button88.setBackgroundResource(android.R.drawable.btn_default);
        button89.setBackgroundResource(android.R.drawable.btn_default);
        button91.setBackgroundResource(android.R.drawable.btn_default);
        button92.setBackgroundResource(android.R.drawable.btn_default);
        button93.setBackgroundResource(android.R.drawable.btn_default);
        button94.setBackgroundResource(android.R.drawable.btn_default);
        button95.setBackgroundResource(android.R.drawable.btn_default);
        button96.setBackgroundResource(android.R.drawable.btn_default);
        button97.setBackgroundResource(android.R.drawable.btn_default);
        button98.setBackgroundResource(android.R.drawable.btn_default);
        button99.setBackgroundResource(android.R.drawable.btn_default);
    }

    //methods to set active game
    private void activeGame1() {
        resetAllButtons();
        button11.setBackgroundColor(Color.parseColor("#C5E1A5"));
        button12.setBackgroundColor(Color.parseColor("#C5E1A5"));
        button13.setBackgroundColor(Color.parseColor("#C5E1A5"));
        button14.setBackgroundColor(Color.parseColor("#C5E1A5"));
        button15.setBackgroundColor(Color.parseColor("#C5E1A5"));
        button16.setBackgroundColor(Color.parseColor("#C5E1A5"));
        button17.setBackgroundColor(Color.parseColor("#C5E1A5"));
        button18.setBackgroundColor(Color.parseColor("#C5E1A5"));
        button19.setBackgroundColor(Color.parseColor("#C5E1A5"));
    }

    private void activeGame2() {
        resetAllButtons();
        button21.setBackgroundColor(Color.parseColor("#C5E1A5"));
        button22.setBackgroundColor(Color.parseColor("#C5E1A5"));
        button23.setBackgroundColor(Color.parseColor("#C5E1A5"));
        button24.setBackgroundColor(Color.parseColor("#C5E1A5"));
        button25.setBackgroundColor(Color.parseColor("#C5E1A5"));
        button26.setBackgroundColor(Color.parseColor("#C5E1A5"));
        button27.setBackgroundColor(Color.parseColor("#C5E1A5"));
        button28.setBackgroundColor(Color.parseColor("#C5E1A5"));
        button29.setBackgroundColor(Color.parseColor("#C5E1A5"));
    }

    private void activeGame3() {
        resetAllButtons();
        button31.setBackgroundColor(Color.parseColor("#C5E1A5"));
        button32.setBackgroundColor(Color.parseColor("#C5E1A5"));
        button33.setBackgroundColor(Color.parseColor("#C5E1A5"));
        button34.setBackgroundColor(Color.parseColor("#C5E1A5"));
        button35.setBackgroundColor(Color.parseColor("#C5E1A5"));
        button36.setBackgroundColor(Color.parseColor("#C5E1A5"));
        button37.setBackgroundColor(Color.parseColor("#C5E1A5"));
        button38.setBackgroundColor(Color.parseColor("#C5E1A5"));
        button39.setBackgroundColor(Color.parseColor("#C5E1A5"));
    }

    private void activeGame4() {
        resetAllButtons();
        button41.setBackgroundColor(Color.parseColor("#C5E1A5"));
        button42.setBackgroundColor(Color.parseColor("#C5E1A5"));
        button43.setBackgroundColor(Color.parseColor("#C5E1A5"));
        button44.setBackgroundColor(Color.parseColor("#C5E1A5"));
        button45.setBackgroundColor(Color.parseColor("#C5E1A5"));
        button46.setBackgroundColor(Color.parseColor("#C5E1A5"));
        button47.setBackgroundColor(Color.parseColor("#C5E1A5"));
        button48.setBackgroundColor(Color.parseColor("#C5E1A5"));
        button49.setBackgroundColor(Color.parseColor("#C5E1A5"));
    }

    private void activeGame5() {
        resetAllButtons();
        button51.setBackgroundColor(Color.parseColor("#C5E1A5"));
        button52.setBackgroundColor(Color.parseColor("#C5E1A5"));
        button53.setBackgroundColor(Color.parseColor("#C5E1A5"));
        button54.setBackgroundColor(Color.parseColor("#C5E1A5"));
        button55.setBackgroundColor(Color.parseColor("#C5E1A5"));
        button56.setBackgroundColor(Color.parseColor("#C5E1A5"));
        button57.setBackgroundColor(Color.parseColor("#C5E1A5"));
        button58.setBackgroundColor(Color.parseColor("#C5E1A5"));
        button59.setBackgroundColor(Color.parseColor("#C5E1A5"));
    }

    private void activeGame6() {
        resetAllButtons();
        button61.setBackgroundColor(Color.parseColor("#C5E1A5"));
        button62.setBackgroundColor(Color.parseColor("#C5E1A5"));
        button63.setBackgroundColor(Color.parseColor("#C5E1A5"));
        button64.setBackgroundColor(Color.parseColor("#C5E1A5"));
        button65.setBackgroundColor(Color.parseColor("#C5E1A5"));
        button66.setBackgroundColor(Color.parseColor("#C5E1A5"));
        button67.setBackgroundColor(Color.parseColor("#C5E1A5"));
        button68.setBackgroundColor(Color.parseColor("#C5E1A5"));
        button69.setBackgroundColor(Color.parseColor("#C5E1A5"));
    }

    private void activeGame7() {
        resetAllButtons();
        button71.setBackgroundColor(Color.parseColor("#C5E1A5"));
        button72.setBackgroundColor(Color.parseColor("#C5E1A5"));
        button73.setBackgroundColor(Color.parseColor("#C5E1A5"));
        button74.setBackgroundColor(Color.parseColor("#C5E1A5"));
        button75.setBackgroundColor(Color.parseColor("#C5E1A5"));
        button76.setBackgroundColor(Color.parseColor("#C5E1A5"));
        button77.setBackgroundColor(Color.parseColor("#C5E1A5"));
        button78.setBackgroundColor(Color.parseColor("#C5E1A5"));
        button79.setBackgroundColor(Color.parseColor("#C5E1A5"));
    }

    private void activeGame8() {
        resetAllButtons();
        button21.setBackgroundColor(Color.parseColor("#C5E1A5"));
        button22.setBackgroundColor(Color.parseColor("#C5E1A5"));
        button23.setBackgroundColor(Color.parseColor("#C5E1A5"));
        button24.setBackgroundColor(Color.parseColor("#C5E1A5"));
        button25.setBackgroundColor(Color.parseColor("#C5E1A5"));
        button26.setBackgroundColor(Color.parseColor("#C5E1A5"));
        button27.setBackgroundColor(Color.parseColor("#C5E1A5"));
        button28.setBackgroundColor(Color.parseColor("#C5E1A5"));
        button29.setBackgroundColor(Color.parseColor("#C5E1A5"));
    }

    private void activeGame9() {
        resetAllButtons();
        button91.setBackgroundColor(Color.parseColor("#C5E1A5"));
        button92.setBackgroundColor(Color.parseColor("#C5E1A5"));
        button93.setBackgroundColor(Color.parseColor("#C5E1A5"));
        button94.setBackgroundColor(Color.parseColor("#C5E1A5"));
        button95.setBackgroundColor(Color.parseColor("#C5E1A5"));
        button96.setBackgroundColor(Color.parseColor("#C5E1A5"));
        button97.setBackgroundColor(Color.parseColor("#C5E1A5"));
        button98.setBackgroundColor(Color.parseColor("#C5E1A5"));
        button99.setBackgroundColor(Color.parseColor("#C5E1A5"));
    }

}
