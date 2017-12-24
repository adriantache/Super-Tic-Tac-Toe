package com.adriantache.supertictactoe;

import android.graphics.LightingColorFilter;
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
    int[][] game1 = new int[4][4];
    int[][] game2 = new int[4][4];
    int[][] game3 = new int[4][4];
    int[][] game4 = new int[4][4];
    int[][] game5 = new int[4][4];
    int[][] game6 = new int[4][4];
    int[][] game7 = new int[4][4];
    int[][] game8 = new int[4][4];
    int[][] game9 = new int[4][4];
    int[][] mainGame = new int[4][4];

    //declare variables
    int currentPlayer = 1;

    //todo remove test tag
    private static final String TAG = "MainActivity";

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
        game2[1][1] = currentPlayer;
        button14.setEnabled(false);
        activeGame1();
    }

    public void button15(View view) {
        game2[1][2] = currentPlayer;
        button15.setEnabled(false);
        activeGame2();
    }

    public void button16(View view) {
        game2[1][3] = currentPlayer;
        button16.setEnabled(false);
        activeGame3();
    }

    public void button17(View view) {
        game3[1][1] = currentPlayer;
        button17.setEnabled(false);
        activeGame1();
    }

    public void button18(View view) {
        game3[1][2] = currentPlayer;
        button18.setEnabled(false);
        activeGame2();
    }

    public void button19(View view) {
        game3[1][3] = currentPlayer;
        button19.setEnabled(false);
        activeGame3();
    }

    public void button21(View view) {
        game1[2][1] = currentPlayer;
        button21.setEnabled(false);
        activeGame4();
    }

    public void button22(View view) {
        game1[2][2] = currentPlayer;
        button22.setEnabled(false);
        activeGame5();
    }

    public void button23(View view) {
        game1[2][3] = currentPlayer;
        button23.setEnabled(false);
        activeGame6();
    }

    public void button24(View view) {
        game2[2][1] = currentPlayer;
        button24.setEnabled(false);
        activeGame4();
    }

    public void button25(View view) {
        game2[2][2] = currentPlayer;
        button25.setEnabled(false);
        activeGame5();
    }

    public void button26(View view) {
        game2[2][3] = currentPlayer;
        button26.setEnabled(false);
        activeGame6();
    }

    public void button27(View view) {
        game3[2][1] = currentPlayer;
        button27.setEnabled(false);
        activeGame4();
    }

    public void button28(View view) {
        game3[2][2] = currentPlayer;
        button28.setEnabled(false);
        activeGame5();
    }

    public void button29(View view) {
        game3[2][3] = currentPlayer;
        button29.setEnabled(false);
        activeGame6();
    }

    public void button31(View view) {
        game1[3][1] = currentPlayer;
        button31.setEnabled(false);
        activeGame7();
    }

    public void button32(View view) {
        game1[3][2] = currentPlayer;
        button32.setEnabled(false);
        activeGame8();
    }

    public void button33(View view) {
        game1[3][3] = currentPlayer;
        button33.setEnabled(false);
        activeGame9();
    }

    public void button34(View view) {
        game2[3][1] = currentPlayer;
        button34.setEnabled(false);
        activeGame7();
    }

    public void button35(View view) {
        game2[3][2] = currentPlayer;
        button35.setEnabled(false);
        activeGame8();
    }

    public void button36(View view) {
        game2[3][3] = currentPlayer;
        button36.setEnabled(false);
        activeGame9();
    }

    public void button37(View view) {
        game3[3][1] = currentPlayer;
        button37.setEnabled(false);
        activeGame7();
    }

    public void button38(View view) {
        game3[3][2] = currentPlayer;
        button38.setEnabled(false);
        activeGame8();
    }

    public void button39(View view) {
        game3[3][3] = currentPlayer;
        button39.setEnabled(false);
        activeGame9();
    }

    public void button41(View view) {
        game4[1][1] = currentPlayer;
        button41.setEnabled(false);
        activeGame1();
    }

    public void button42(View view) {
        game4[1][2] = currentPlayer;
        button42.setEnabled(false);
        activeGame2();
    }

    public void button43(View view) {
        game4[1][3] = currentPlayer;
        button43.setEnabled(false);
        activeGame3();
    }

    public void button44(View view) {
        game5[1][1] = currentPlayer;
        button44.setEnabled(false);
        activeGame1();
    }

    public void button45(View view) {
        game5[1][2] = currentPlayer;
        button45.setEnabled(false);
        activeGame2();
    }

    public void button46(View view) {
        game5[1][3] = currentPlayer;
        button46.setEnabled(false);
        activeGame3();
    }

    public void button47(View view) {
        game6[1][1] = currentPlayer;
        button47.setEnabled(false);
        activeGame1();
    }

    public void button48(View view) {
        game6[1][2] = currentPlayer;
        button48.setEnabled(false);
        activeGame2();
    }

    public void button49(View view) {
        game6[1][3] = currentPlayer;
        button49.setEnabled(false);
        activeGame3();
    }

    public void button51(View view) {
        game4[2][1] = currentPlayer;
        button51.setEnabled(false);
        activeGame4();
    }

    public void button52(View view) {
        game4[2][2] = currentPlayer;
        button52.setEnabled(false);
        activeGame5();
    }

    public void button53(View view) {
        game4[2][3] = currentPlayer;
        button53.setEnabled(false);
        activeGame6();
    }

    public void button54(View view) {
        game5[2][1] = currentPlayer;
        button54.setEnabled(false);
        activeGame4();
    }

    public void button55(View view) {
        game5[2][2] = currentPlayer;
        button55.setEnabled(false);
        activeGame5();
    }

    public void button56(View view) {
        game5[2][3] = currentPlayer;
        button56.setEnabled(false);
        activeGame6();
    }

    public void button57(View view) {
        game6[2][1] = currentPlayer;
        button57.setEnabled(false);
        activeGame4();
    }

    public void button58(View view) {
        game6[2][2] = currentPlayer;
        button58.setEnabled(false);
        activeGame5();
    }

    public void button59(View view) {
        game6[2][3] = currentPlayer;
        button59.setEnabled(false);
        activeGame6();
    }

    public void button61(View view) {
        game4[3][1] = currentPlayer;
        button61.setEnabled(false);
        activeGame7();
    }

    public void button62(View view) {
        game4[3][2] = currentPlayer;
        button62.setEnabled(false);
        activeGame8();
    }

    public void button63(View view) {
        game4[3][3] = currentPlayer;
        button63.setEnabled(false);
        activeGame9();
    }

    public void button64(View view) {
        game5[3][1] = currentPlayer;
        button64.setEnabled(false);
        activeGame7();
    }

    public void button65(View view) {
        game5[3][2] = currentPlayer;
        button65.setEnabled(false);
        activeGame8();
    }

    public void button66(View view) {
        game5[3][3] = currentPlayer;
        button66.setEnabled(false);
        activeGame9();
    }

    public void button67(View view) {
        game6[3][1] = currentPlayer;
        button67.setEnabled(false);
        activeGame7();
    }

    public void button68(View view) {
        game6[3][2] = currentPlayer;
        button68.setEnabled(false);
        activeGame8();
    }

    public void button69(View view) {
        game6[3][3] = currentPlayer;
        button69.setEnabled(false);
        activeGame9();
    }

    public void button71(View view) {
        game7[1][1] = currentPlayer;
        button71.setEnabled(false);
        activeGame1();
    }

    public void button72(View view) {
        game7[1][2] = currentPlayer;
        button72.setEnabled(false);
        activeGame2();
    }

    public void button73(View view) {
        game7[1][3] = currentPlayer;
        button73.setEnabled(false);
        activeGame3();
    }

    public void button74(View view) {
        game8[1][1] = currentPlayer;
        button74.setEnabled(false);
        activeGame1();
    }

    public void button75(View view) {
        game8[1][2] = currentPlayer;
        button75.setEnabled(false);
        activeGame2();
    }

    public void button76(View view) {
        game8[1][3] = currentPlayer;
        button76.setEnabled(false);
        activeGame3();
    }

    public void button77(View view) {
        game9[1][1] = currentPlayer;
        button77.setEnabled(false);
        activeGame1();
    }

    public void button78(View view) {
        game9[1][2] = currentPlayer;
        button78.setEnabled(false);
        activeGame2();
    }

    public void button79(View view) {
        game9[1][3] = currentPlayer;
        button79.setEnabled(false);
        activeGame3();
    }

    public void button81(View view) {
        game7[2][1] = currentPlayer;
        button81.setEnabled(false);
        activeGame4();
    }

    public void button82(View view) {
        game7[2][2] = currentPlayer;
        button82.setEnabled(false);
        activeGame5();
    }

    public void button83(View view) {
        game7[2][3] = currentPlayer;
        button83.setEnabled(false);
        activeGame6();
    }

    public void button84(View view) {
        game8[2][1] = currentPlayer;
        button84.setEnabled(false);
        activeGame4();
    }

    public void button85(View view) {
        game8[2][2] = currentPlayer;
        button85.setEnabled(false);
        activeGame5();
    }

    public void button86(View view) {
        game8[2][3] = currentPlayer;
        button86.setEnabled(false);
        activeGame6();
    }

    public void button87(View view) {
        game9[2][1] = currentPlayer;
        button87.setEnabled(false);
        activeGame4();
    }

    public void button88(View view) {
        game9[2][2] = currentPlayer;
        button88.setEnabled(false);
        activeGame5();
    }

    public void button89(View view) {
        game9[2][3] = currentPlayer;
        button89.setEnabled(false);
        activeGame6();
    }

    public void button91(View view) {
        game7[3][1] = currentPlayer;
        button91.setEnabled(false);
        activeGame7();
    }

    public void button92(View view) {
        game7[3][2] = currentPlayer;
        button92.setEnabled(false);
        activeGame8();
    }

    public void button93(View view) {
        game7[3][3] = currentPlayer;
        button93.setEnabled(false);
        activeGame9();
    }

    public void button94(View view) {
        game8[3][1] = currentPlayer;
        button94.setEnabled(false);
        activeGame7();
    }

    public void button95(View view) {
        game8[3][2] = currentPlayer;
        button95.setEnabled(false);
        activeGame8();
    }

    public void button96(View view) {
        game8[3][3] = currentPlayer;
        button96.setEnabled(false);
        activeGame9();
    }

    public void button97(View view) {
        game9[3][1] = currentPlayer;
        button97.setEnabled(false);
        activeGame7();
    }

    public void button98(View view) {
        game9[3][2] = currentPlayer;
        button98.setEnabled(false);
        activeGame8();
    }

    public void button99(View view) {
        game9[3][3] = currentPlayer;
        button99.setEnabled(false);
        activeGame9();
    }

    //method to remove highlighting by setting a null color filters
    public void resetAllButtons() {
        button11.getBackground().setColorFilter(null);
        button12.getBackground().setColorFilter(null);
        button13.getBackground().setColorFilter(null);
        button14.getBackground().setColorFilter(null);
        button15.getBackground().setColorFilter(null);
        button16.getBackground().setColorFilter(null);
        button17.getBackground().setColorFilter(null);
        button18.getBackground().setColorFilter(null);
        button19.getBackground().setColorFilter(null);
        button21.getBackground().setColorFilter(null);
        button22.getBackground().setColorFilter(null);
        button23.getBackground().setColorFilter(null);
        button24.getBackground().setColorFilter(null);
        button25.getBackground().setColorFilter(null);
        button26.getBackground().setColorFilter(null);
        button27.getBackground().setColorFilter(null);
        button28.getBackground().setColorFilter(null);
        button29.getBackground().setColorFilter(null);
        button31.getBackground().setColorFilter(null);
        button32.getBackground().setColorFilter(null);
        button33.getBackground().setColorFilter(null);
        button34.getBackground().setColorFilter(null);
        button35.getBackground().setColorFilter(null);
        button36.getBackground().setColorFilter(null);
        button37.getBackground().setColorFilter(null);
        button38.getBackground().setColorFilter(null);
        button39.getBackground().setColorFilter(null);
        button41.getBackground().setColorFilter(null);
        button42.getBackground().setColorFilter(null);
        button43.getBackground().setColorFilter(null);
        button44.getBackground().setColorFilter(null);
        button45.getBackground().setColorFilter(null);
        button46.getBackground().setColorFilter(null);
        button47.getBackground().setColorFilter(null);
        button48.getBackground().setColorFilter(null);
        button49.getBackground().setColorFilter(null);
        button51.getBackground().setColorFilter(null);
        button52.getBackground().setColorFilter(null);
        button53.getBackground().setColorFilter(null);
        button54.getBackground().setColorFilter(null);
        button55.getBackground().setColorFilter(null);
        button56.getBackground().setColorFilter(null);
        button57.getBackground().setColorFilter(null);
        button58.getBackground().setColorFilter(null);
        button59.getBackground().setColorFilter(null);
        button61.getBackground().setColorFilter(null);
        button62.getBackground().setColorFilter(null);
        button63.getBackground().setColorFilter(null);
        button64.getBackground().setColorFilter(null);
        button65.getBackground().setColorFilter(null);
        button66.getBackground().setColorFilter(null);
        button67.getBackground().setColorFilter(null);
        button68.getBackground().setColorFilter(null);
        button69.getBackground().setColorFilter(null);
        button71.getBackground().setColorFilter(null);
        button72.getBackground().setColorFilter(null);
        button73.getBackground().setColorFilter(null);
        button74.getBackground().setColorFilter(null);
        button75.getBackground().setColorFilter(null);
        button76.getBackground().setColorFilter(null);
        button77.getBackground().setColorFilter(null);
        button78.getBackground().setColorFilter(null);
        button79.getBackground().setColorFilter(null);
        button81.getBackground().setColorFilter(null);
        button82.getBackground().setColorFilter(null);
        button83.getBackground().setColorFilter(null);
        button84.getBackground().setColorFilter(null);
        button85.getBackground().setColorFilter(null);
        button86.getBackground().setColorFilter(null);
        button87.getBackground().setColorFilter(null);
        button88.getBackground().setColorFilter(null);
        button89.getBackground().setColorFilter(null);
        button91.getBackground().setColorFilter(null);
        button92.getBackground().setColorFilter(null);
        button93.getBackground().setColorFilter(null);
        button94.getBackground().setColorFilter(null);
        button95.getBackground().setColorFilter(null);
        button96.getBackground().setColorFilter(null);
        button97.getBackground().setColorFilter(null);
        button98.getBackground().setColorFilter(null);
        button99.getBackground().setColorFilter(null);
    }

    //methods to set active game
    public void activeGame1() {
        //remove all highlighting
        resetAllButtons();

        //highlight buttons you can click using a color filter
        button11.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
        button12.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
        button13.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
        button21.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
        button22.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
        button23.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
        button31.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
        button32.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
        button33.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));

    }

    public void activeGame2() {
        //remove all highlighting
        resetAllButtons();

        //highlight buttons you can click
        button14.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
        button15.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
        button16.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
        button24.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
        button25.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
        button26.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
        button34.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
        button35.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
        button36.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));

    }

    public void activeGame3() {
        //remove all highlighting
        resetAllButtons();

        //highlight buttons you can click
        button17.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
        button18.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
        button19.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
        button27.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
        button28.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
        button29.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
        button37.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
        button38.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
        button39.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));

    }

    public void activeGame4() {
        //remove all highlighting
        resetAllButtons();

        //highlight buttons you can click
        button41.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
        button42.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
        button43.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
        button51.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
        button52.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
        button53.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
        button61.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
        button62.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
        button63.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));

    }

    public void activeGame5() {
        //remove all highlighting
        resetAllButtons();

        //highlight buttons you can click
        button44.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
        button45.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
        button46.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
        button54.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
        button55.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
        button56.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
        button64.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
        button65.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
        button66.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));

    }

    public void activeGame6() {
        //remove all highlighting
        resetAllButtons();

        //highlight buttons you can click
        button47.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
        button48.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
        button49.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
        button57.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
        button58.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
        button59.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
        button67.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
        button68.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
        button69.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));

    }

    public void activeGame7() {
        //remove all highlighting
        resetAllButtons();

        //highlight buttons you can click
        button71.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
        button72.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
        button73.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
        button81.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
        button82.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
        button83.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
        button91.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
        button92.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
        button93.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));

    }

    public void activeGame8() {
        //remove all highlighting
        resetAllButtons();

        //highlight buttons you can click
        button74.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
        button75.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
        button76.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
        button84.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
        button85.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
        button86.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
        button94.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
        button95.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
        button96.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));

    }

    public void activeGame9() {
        //remove all highlighting
        resetAllButtons();

        //highlight buttons you can click
        button77.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
        button78.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
        button79.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
        button87.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
        button88.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
        button89.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
        button97.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
        button98.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
        button99.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));

    }


}
