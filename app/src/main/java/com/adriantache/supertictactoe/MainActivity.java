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
    int currentGame = 0;

    //todo remove test tag
    private static final String TAG = "MainActivity";

    public void reset(View view) {
        //todo implement reset functionality

        // reset all highlighting
        resetAllButtons();

        // reenable all buttons
        button11.setEnabled(true);
        button12.setEnabled(true);
        button13.setEnabled(true);
        button14.setEnabled(true);
        button15.setEnabled(true);
        button16.setEnabled(true);
        button17.setEnabled(true);
        button18.setEnabled(true);
        button19.setEnabled(true);
        button21.setEnabled(true);
        button22.setEnabled(true);
        button23.setEnabled(true);
        button24.setEnabled(true);
        button25.setEnabled(true);
        button26.setEnabled(true);
        button27.setEnabled(true);
        button28.setEnabled(true);
        button29.setEnabled(true);
        button31.setEnabled(true);
        button32.setEnabled(true);
        button33.setEnabled(true);
        button34.setEnabled(true);
        button35.setEnabled(true);
        button36.setEnabled(true);
        button37.setEnabled(true);
        button38.setEnabled(true);
        button39.setEnabled(true);
        button41.setEnabled(true);
        button42.setEnabled(true);
        button43.setEnabled(true);
        button44.setEnabled(true);
        button45.setEnabled(true);
        button46.setEnabled(true);
        button47.setEnabled(true);
        button48.setEnabled(true);
        button49.setEnabled(true);
        button51.setEnabled(true);
        button52.setEnabled(true);
        button53.setEnabled(true);
        button54.setEnabled(true);
        button55.setEnabled(true);
        button56.setEnabled(true);
        button57.setEnabled(true);
        button58.setEnabled(true);
        button59.setEnabled(true);
        button61.setEnabled(true);
        button62.setEnabled(true);
        button63.setEnabled(true);
        button64.setEnabled(true);
        button65.setEnabled(true);
        button66.setEnabled(true);
        button67.setEnabled(true);
        button68.setEnabled(true);
        button69.setEnabled(true);
        button71.setEnabled(true);
        button72.setEnabled(true);
        button73.setEnabled(true);
        button74.setEnabled(true);
        button75.setEnabled(true);
        button76.setEnabled(true);
        button77.setEnabled(true);
        button78.setEnabled(true);
        button79.setEnabled(true);
        button81.setEnabled(true);
        button82.setEnabled(true);
        button83.setEnabled(true);
        button84.setEnabled(true);
        button85.setEnabled(true);
        button86.setEnabled(true);
        button87.setEnabled(true);
        button88.setEnabled(true);
        button89.setEnabled(true);
        button91.setEnabled(true);
        button92.setEnabled(true);
        button93.setEnabled(true);
        button94.setEnabled(true);
        button95.setEnabled(true);
        button96.setEnabled(true);
        button97.setEnabled(true);
        button98.setEnabled(true);
        button99.setEnabled(true);

    }

    //all 81 methods for the individual buttons
    public void button11(View view) {
        if (currentGame == 0) currentGame = 1;
        if (currentGame != 1) return;
        else {
            game1[1][1] = currentPlayer;
            currentGame = 1;
            button11.setEnabled(false);
            activeGame1();
            if (currentPlayer == 1) {
                button11.setText("X");
                currentPlayer = 2;
            } else {
                button11.setText("O");
                currentPlayer = 1;
            }
        }
    }

    public void button12(View view) {
        if (currentGame == 0) currentGame = 2;
        if (currentGame != 1) return;
        else {
            game1[1][2] = currentPlayer;
            currentGame = 2;
            button12.setEnabled(false);
            activeGame2();
            if (currentPlayer == 1) {
                button12.setText("X");
                currentPlayer = 2;
            } else {
                button12.setText("O");
                currentPlayer = 1;
            }
        }
    }

    public void button13(View view) {
        if (currentGame == 0) currentGame = 3;
        if (currentGame != 1) return;
        else {
            game1[1][3] = currentPlayer;
            currentGame = 3;
            button13.setEnabled(false);
            activeGame3();
            if (currentPlayer == 1) {
                button13.setText("X");
                currentPlayer = 2;
            } else {
                button13.setText("O");
                currentPlayer = 1;
            }
        }
    }

    public void button14(View view) {
        if (currentGame == 0) currentGame = 1;
        if (currentGame != 2) return;
        else {
            game2[1][1] = currentPlayer;
            currentGame = 1;
            button14.setEnabled(false);
            activeGame1();
            if (currentPlayer == 1) {
                button14.setText("X");
                currentPlayer = 2;
            } else {
                button14.setText("O");
                currentPlayer = 1;
            }
        }
    }

    public void button15(View view) {
        if (currentGame == 0) currentGame = 2;
        if (currentGame != 2) return;
        else {
            game2[1][2] = currentPlayer;
            currentGame = 2;
            button15.setEnabled(false);
            activeGame2();
            if (currentPlayer == 1) {
                button15.setText("X");
                currentPlayer = 2;
            } else {
                button15.setText("O");
                currentPlayer = 1;
            }
        }
    }

    public void button16(View view) {
        if (currentGame == 0) currentGame = 3;
        if (currentGame != 2) return;
        else {
            game2[1][3] = currentPlayer;
            currentGame = 3;
            button16.setEnabled(false);
            activeGame3();
            if (currentPlayer == 1) {
                button16.setText("X");
                currentPlayer = 2;
            } else {
                button16.setText("O");
                currentPlayer = 1;
            }
        }
    }

    public void button17(View view) {
        if (currentGame == 0) currentGame = 1;
        if (currentGame != 3) return;
        else {
            game3[1][1] = currentPlayer;
            currentGame = 1;
            button17.setEnabled(false);
            activeGame1();
            if (currentPlayer == 1) {
                button17.setText("X");
                currentPlayer = 2;
            } else {
                button17.setText("O");
                currentPlayer = 1;
            }
        }
    }

    public void button18(View view) {
        if (currentGame == 0) currentGame = 2;
        if (currentGame != 3) return;
        else {
            game3[1][2] = currentPlayer;
            currentGame = 2;
            button18.setEnabled(false);
            activeGame2();
            if (currentPlayer == 1) {
                button18.setText("X");
                currentPlayer = 2;
            } else {
                button18.setText("O");
                currentPlayer = 1;
            }
        }
    }

    public void button19(View view) {
        if (currentGame == 0) currentGame = 3;
        if (currentGame != 3) return;
        else {
            game3[1][3] = currentPlayer;
            currentGame = 3;
            button19.setEnabled(false);
            activeGame3();
            if (currentPlayer == 1) {
                button19.setText("X");
                currentPlayer = 2;
            } else {
                button19.setText("O");
                currentPlayer = 1;
            }
        }
    }

    public void button21(View view) {
        if (currentGame == 0) currentGame = 4;
        if (currentGame != 1) return;
        else {
            game1[2][1] = currentPlayer;
            currentGame = 4;
            button21.setEnabled(false);
            activeGame4();
            if (currentPlayer == 1) {
                button21.setText("X");
                currentPlayer = 2;
            } else {
                button21.setText("O");
                currentPlayer = 1;
            }
        }
    }

    public void button22(View view) {
        if (currentGame == 0) currentGame = 5;
        if (currentGame != 1) return;
        else {
            game1[2][2] = currentPlayer;
            currentGame = 5;
            button22.setEnabled(false);
            activeGame5();
            if (currentPlayer == 1) {
                button22.setText("X");
                currentPlayer = 2;
            } else {
                button22.setText("O");
                currentPlayer = 1;
            }
        }
    }

    public void button23(View view) {
        if (currentGame == 0) currentGame = 6;
        if (currentGame != 1) return;
        else {
            game1[2][3] = currentPlayer;
            currentGame = 6;
            button23.setEnabled(false);
            activeGame6();
            if (currentPlayer == 1) {
                button23.setText("X");
                currentPlayer = 2;
            } else {
                button23.setText("O");
                currentPlayer = 1;
            }
        }
    }

    public void button24(View view) {
        if (currentGame == 0) currentGame = 4;
        if (currentGame != 2) return;
        else {
            game2[2][1] = currentPlayer;
            currentGame = 4;
            button24.setEnabled(false);
            activeGame4();
            if (currentPlayer == 1) {
                button24.setText("X");
                currentPlayer = 2;
            } else {
                button24.setText("O");
                currentPlayer = 1;
            }
        }
    }

    public void button25(View view) {
        if (currentGame == 0) currentGame = 5;
        if (currentGame != 2) return;
        else {
            game2[2][2] = currentPlayer;
            currentGame = 5;
            button25.setEnabled(false);
            activeGame5();
            if (currentPlayer == 1) {
                button25.setText("X");
                currentPlayer = 2;
            } else {
                button25.setText("O");
                currentPlayer = 1;
            }
        }
    }

    public void button26(View view) {
        if (currentGame == 0) currentGame = 6;
        if (currentGame != 2) return;
        else {
            game2[2][3] = currentPlayer;
            currentGame = 6;
            button26.setEnabled(false);
            activeGame6();
            if (currentPlayer == 1) {
                button26.setText("X");
                currentPlayer = 2;
            } else {
                button26.setText("O");
                currentPlayer = 1;
            }
        }
    }

    public void button27(View view) {
        if (currentGame == 0) currentGame = 4;
        if (currentGame != 3) return;
        else {
            game3[2][1] = currentPlayer;
            currentGame = 4;
            button27.setEnabled(false);
            activeGame4();
            if (currentPlayer == 1) {
                button27.setText("X");
                currentPlayer = 2;
            } else {
                button27.setText("O");
                currentPlayer = 1;
            }
        }
    }

    public void button28(View view) {
        if (currentGame == 0) currentGame = 5;
        if (currentGame != 3) return;
        else {
            game3[2][2] = currentPlayer;
            currentGame = 5;
            button28.setEnabled(false);
            activeGame5();
            if (currentPlayer == 1) {
                button28.setText("X");
                currentPlayer = 2;
            } else {
                button28.setText("O");
                currentPlayer = 1;
            }
        }
    }

    public void button29(View view) {
        if (currentGame == 0) currentGame = 6;
        if (currentGame != 3) return;
        else {
            game3[2][3] = currentPlayer;
            currentGame = 6;
            button29.setEnabled(false);
            activeGame6();
            if (currentPlayer == 1) {
                button29.setText("X");
                currentPlayer = 2;
            } else {
                button29.setText("O");
                currentPlayer = 1;
            }
        }
    }

    public void button31(View view) {
        if (currentGame == 0) currentGame = 7;
        if (currentGame != 1) return;
        else {
            game1[3][1] = currentPlayer;
            currentGame = 7;
            button31.setEnabled(false);
            activeGame7();
            if (currentPlayer == 1) {
                button31.setText("X");
                currentPlayer = 2;
            } else {
                button31.setText("O");
                currentPlayer = 1;
            }
        }
    }

    public void button32(View view) {
        if (currentGame == 0) currentGame = 8;
        if (currentGame != 1) return;
        else {
            game1[3][2] = currentPlayer;
            currentGame = 8;
            button32.setEnabled(false);
            activeGame8();
            if (currentPlayer == 1) {
                button32.setText("X");
                currentPlayer = 2;
            } else {
                button32.setText("O");
                currentPlayer = 1;
            }
        }
    }

    public void button33(View view) {
        if (currentGame == 0) currentGame = 9;
        if (currentGame != 1) return;
        else {
            game1[3][3] = currentPlayer;
            currentGame = 9;
            button33.setEnabled(false);
            activeGame9();
            if (currentPlayer == 1) {
                button33.setText("X");
                currentPlayer = 2;
            } else {
                button33.setText("O");
                currentPlayer = 1;
            }
        }
    }

    public void button34(View view) {
        if (currentGame == 0) currentGame = 7;
        if (currentGame != 2) return;
        else {
            game2[3][1] = currentPlayer;
            currentGame = 7;
            button34.setEnabled(false);
            activeGame7();
            if (currentPlayer == 1) {
                button34.setText("X");
                currentPlayer = 2;
            } else {
                button34.setText("O");
                currentPlayer = 1;
            }
        }
    }

    public void button35(View view) {
        if (currentGame == 0) currentGame = 8;
        if (currentGame != 2) return;
        else {
            game2[3][2] = currentPlayer;
            currentGame = 8;
            button35.setEnabled(false);
            activeGame8();
            if (currentPlayer == 1) {
                button35.setText("X");
                currentPlayer = 2;
            } else {
                button35.setText("O");
                currentPlayer = 1;
            }
        }
    }

    public void button36(View view) {
        if (currentGame == 0) currentGame = 9;
        if (currentGame != 2) return;
        else {
            game2[3][3] = currentPlayer;
            currentGame = 9;
            button36.setEnabled(false);
            activeGame9();
            if (currentPlayer == 1) {
                button36.setText("X");
                currentPlayer = 2;
            } else {
                button36.setText("O");
                currentPlayer = 1;
            }
        }
    }

    public void button37(View view) {
        if (currentGame == 0) currentGame = 7;
        if (currentGame != 3) return;
        else {
            game3[3][1] = currentPlayer;
            currentGame = 7;
            button37.setEnabled(false);
            activeGame7();
            if (currentPlayer == 1) {
                button37.setText("X");
                currentPlayer = 2;
            } else {
                button37.setText("O");
                currentPlayer = 1;
            }
        }
    }

    public void button38(View view) {
        if (currentGame == 0) currentGame = 8;
        if (currentGame != 3) return;
        else {
            game3[3][2] = currentPlayer;
            currentGame = 8;
            button38.setEnabled(false);
            activeGame8();
            if (currentPlayer == 1) {
                button38.setText("X");
                currentPlayer = 2;
            } else {
                button38.setText("O");
                currentPlayer = 1;
            }
        }
    }

    public void button39(View view) {
        if (currentGame == 0) currentGame = 9;
        if (currentGame != 3) return;
        else {
            game3[3][3] = currentPlayer;
            currentGame = 9;
            button39.setEnabled(false);
            activeGame9();
            if (currentPlayer == 1) {
                button39.setText("X");
                currentPlayer = 2;
            } else {
                button39.setText("O");
                currentPlayer = 1;
            }
        }
    }

    public void button41(View view) {
        if (currentGame == 0) currentGame = 1;
        if (currentGame != 4) return;
        else {
            game4[1][1] = currentPlayer;
            currentGame = 1;
            button41.setEnabled(false);
            activeGame1();
            if (currentPlayer == 1) {
                button41.setText("X");
                currentPlayer = 2;
            } else {
                button41.setText("O");
                currentPlayer = 1;
            }
        }
    }

    public void button42(View view) {
        if (currentGame == 0) currentGame = 2;
        if (currentGame != 4) return;
        else {
            game4[1][2] = currentPlayer;
            currentGame = 2;
            button42.setEnabled(false);
            activeGame2();
            if (currentPlayer == 1) {
                button42.setText("X");
                currentPlayer = 2;
            } else {
                button42.setText("O");
                currentPlayer = 1;
            }
        }
    }

    public void button43(View view) {
        if (currentGame == 0) currentGame = 3;
        if (currentGame != 4) return;
        else {
            game4[1][3] = currentPlayer;
            currentGame = 3;
            button43.setEnabled(false);
            activeGame3();
            if (currentPlayer == 1) {
                button43.setText("X");
                currentPlayer = 2;
            } else {
                button43.setText("O");
                currentPlayer = 1;
            }
        }
    }

    public void button44(View view) {
        if (currentGame == 0) currentGame = 1;
        if (currentGame != 5) return;
        else {
            game5[1][1] = currentPlayer;
            currentGame = 1;
            button44.setEnabled(false);
            activeGame1();
            if (currentPlayer == 1) {
                button44.setText("X");
                currentPlayer = 2;
            } else {
                button44.setText("O");
                currentPlayer = 1;
            }
        }
    }

    public void button45(View view) {
        if (currentGame == 0) currentGame = 2;
        if (currentGame != 5) return;
        else {
            game5[1][2] = currentPlayer;
            currentGame = 2;
            button45.setEnabled(false);
            activeGame2();
            if (currentPlayer == 1) {
                button45.setText("X");
                currentPlayer = 2;
            } else {
                button45.setText("O");
                currentPlayer = 1;
            }
        }
    }

    public void button46(View view) {
        if (currentGame == 0) currentGame = 3;
        if (currentGame != 5) return;
        else {
            game5[1][3] = currentPlayer;
            currentGame = 3;
            button46.setEnabled(false);
            activeGame3();
            if (currentPlayer == 1) {
                button46.setText("X");
                currentPlayer = 2;
            } else {
                button46.setText("O");
                currentPlayer = 1;
            }
        }
    }

    public void button47(View view) {
        if (currentGame == 0) currentGame = 1;
        if (currentGame != 6) return;
        else {
            game6[1][1] = currentPlayer;
            currentGame = 1;
            button47.setEnabled(false);
            activeGame1();
            if (currentPlayer == 1) {
                button47.setText("X");
                currentPlayer = 2;
            } else {
                button47.setText("O");
                currentPlayer = 1;
            }
        }
    }

    public void button48(View view) {
        if (currentGame == 0) currentGame = 2;
        if (currentGame != 6) return;
        else {
            game6[1][2] = currentPlayer;
            currentGame = 2;
            button48.setEnabled(false);
            activeGame2();
            if (currentPlayer == 1) {
                button48.setText("X");
                currentPlayer = 2;
            } else {
                button48.setText("O");
                currentPlayer = 1;
            }
        }
    }

    public void button49(View view) {
        if (currentGame == 0) currentGame = 3;
        if (currentGame != 6) return;
        else {
            game6[1][3] = currentPlayer;
            currentGame = 3;
            button49.setEnabled(false);
            activeGame3();
            if (currentPlayer == 1) {
                button49.setText("X");
                currentPlayer = 2;
            } else {
                button49.setText("O");
                currentPlayer = 1;
            }
        }
    }

    public void button51(View view) {
        if (currentGame == 0) currentGame = 4;
        if (currentGame != 4) return;
        else {
            game4[2][1] = currentPlayer;
            currentGame = 4;
            button51.setEnabled(false);
            activeGame4();
            if (currentPlayer == 1) {
                button51.setText("X");
                currentPlayer = 2;
            } else {
                button51.setText("O");
                currentPlayer = 1;
            }
        }
    }

    public void button52(View view) {
        if (currentGame == 0) currentGame = 5;
        if (currentGame != 4) return;
        else {
            game4[2][2] = currentPlayer;
            currentGame = 5;
            button52.setEnabled(false);
            activeGame5();
            if (currentPlayer == 1) {
                button52.setText("X");
                currentPlayer = 2;
            } else {
                button52.setText("O");
                currentPlayer = 1;
            }
        }
    }

    public void button53(View view) {
        if (currentGame == 0) currentGame = 6;
        if (currentGame != 4) return;
        else {
            game4[2][3] = currentPlayer;
            currentGame = 6;
            button53.setEnabled(false);
            activeGame6();
            if (currentPlayer == 1) {
                button53.setText("X");
                currentPlayer = 2;
            } else {
                button53.setText("O");
                currentPlayer = 1;
            }
        }
    }

    public void button54(View view) {
        if (currentGame == 0) currentGame = 4;
        if (currentGame != 5) return;
        else {
            game5[2][1] = currentPlayer;
            currentGame = 4;
            button54.setEnabled(false);
            activeGame4();
            if (currentPlayer == 1) {
                button54.setText("X");
                currentPlayer = 2;
            } else {
                button54.setText("O");
                currentPlayer = 1;
            }
        }
    }

    public void button55(View view) {
        if (currentGame == 0) currentGame = 5;
        if (currentGame != 5) return;
        else {
            game5[2][2] = currentPlayer;
            currentGame = 5;
            button55.setEnabled(false);
            activeGame5();
            if (currentPlayer == 1) {
                button55.setText("X");
                currentPlayer = 2;
            } else {
                button55.setText("O");
                currentPlayer = 1;
            }
        }
    }

    public void button56(View view) {
        if (currentGame == 0) currentGame = 6;
        if (currentGame != 5) return;
        else {
            game5[2][3] = currentPlayer;
            currentGame = 6;
            button56.setEnabled(false);
            activeGame6();
            if (currentPlayer == 1) {
                button56.setText("X");
                currentPlayer = 2;
            } else {
                button56.setText("O");
                currentPlayer = 1;
            }
        }
    }

    public void button57(View view) {
        if (currentGame == 0) currentGame = 4;
        if (currentGame != 6) return;
        else {
            game6[2][1] = currentPlayer;
            currentGame = 4;
            button57.setEnabled(false);
            activeGame4();
            if (currentPlayer == 1) {
                button57.setText("X");
                currentPlayer = 2;
            } else {
                button57.setText("O");
                currentPlayer = 1;
            }
        }
    }

    public void button58(View view) {
        if (currentGame == 0) currentGame = 5;
        if (currentGame != 6) return;
        else {
            game6[2][2] = currentPlayer;
            currentGame = 5;
            button58.setEnabled(false);
            activeGame5();
            if (currentPlayer == 1) {
                button58.setText("X");
                currentPlayer = 2;
            } else {
                button58.setText("O");
                currentPlayer = 1;
            }
        }
    }

    public void button59(View view) {
        if (currentGame == 0) currentGame = 6;
        if (currentGame != 6) return;
        else {
            game6[2][3] = currentPlayer;
            currentGame = 6;
            button59.setEnabled(false);
            activeGame6();
            if (currentPlayer == 1) {
                button59.setText("X");
                currentPlayer = 2;
            } else {
                button59.setText("O");
                currentPlayer = 1;
            }
        }
    }

    public void button61(View view) {
        if (currentGame == 0) currentGame = 7;
        if (currentGame != 4) return;
        else {
            game4[3][1] = currentPlayer;
            currentGame = 7;
            button61.setEnabled(false);
            activeGame7();
            if (currentPlayer == 1) {
                button61.setText("X");
                currentPlayer = 2;
            } else {
                button61.setText("O");
                currentPlayer = 1;
            }
        }
    }

    public void button62(View view) {
        if (currentGame == 0) currentGame = 8;
        if (currentGame != 4) return;
        else {
            game4[3][2] = currentPlayer;
            currentGame = 8;
            button62.setEnabled(false);
            activeGame8();
            if (currentPlayer == 1) {
                button62.setText("X");
                currentPlayer = 2;
            } else {
                button62.setText("O");
                currentPlayer = 1;
            }
        }
    }

    public void button63(View view) {
        if (currentGame == 0) currentGame = 9;
        if (currentGame != 4) return;
        else {
            game4[3][3] = currentPlayer;
            currentGame = 9;
            button63.setEnabled(false);
            activeGame9();
            if (currentPlayer == 1) {
                button63.setText("X");
                currentPlayer = 2;
            } else {
                button63.setText("O");
                currentPlayer = 1;
            }
        }
    }

    public void button64(View view) {
        if (currentGame == 0) currentGame = 7;
        if (currentGame != 5) return;
        else {
            game5[3][1] = currentPlayer;
            currentGame = 7;
            button64.setEnabled(false);
            activeGame7();
            if (currentPlayer == 1) {
                button64.setText("X");
                currentPlayer = 2;
            } else {
                button64.setText("O");
                currentPlayer = 1;
            }
        }
    }

    public void button65(View view) {
        if (currentGame == 0) currentGame = 8;
        if (currentGame != 5) return;
        else {
            game5[3][2] = currentPlayer;
            currentGame = 8;
            button65.setEnabled(false);
            activeGame8();
            if (currentPlayer == 1) {
                button65.setText("X");
                currentPlayer = 2;
            } else {
                button65.setText("O");
                currentPlayer = 1;
            }
        }
    }

    public void button66(View view) {
        if (currentGame == 0) currentGame = 9;
        if (currentGame != 5) return;
        else {
            game5[3][3] = currentPlayer;
            currentGame = 9;
            button66.setEnabled(false);
            activeGame9();
            if (currentPlayer == 1) {
                button66.setText("X");
                currentPlayer = 2;
            } else {
                button66.setText("O");
                currentPlayer = 1;
            }
        }
    }

    public void button67(View view) {
        if (currentGame == 0) currentGame = 7;
        if (currentGame != 6) return;
        else {
            game6[3][1] = currentPlayer;
            currentGame = 7;
            button67.setEnabled(false);
            activeGame7();
            if (currentPlayer == 1) {
                button67.setText("X");
                currentPlayer = 2;
            } else {
                button67.setText("O");
                currentPlayer = 1;
            }
        }
    }

    public void button68(View view) {
        if (currentGame == 0) currentGame = 8;
        if (currentGame != 6) return;
        else {
            game6[3][2] = currentPlayer;
            currentGame = 8;
            button68.setEnabled(false);
            activeGame8();
            if (currentPlayer == 1) {
                button68.setText("X");
                currentPlayer = 2;
            } else {
                button68.setText("O");
                currentPlayer = 1;
            }
        }
    }

    public void button69(View view) {
        if (currentGame == 0) currentGame = 9;
        if (currentGame != 6) return;
        else {
            game6[3][3] = currentPlayer;
            currentGame = 9;
            button69.setEnabled(false);
            activeGame9();
            if (currentPlayer == 1) {
                button69.setText("X");
                currentPlayer = 2;
            } else {
                button69.setText("O");
                currentPlayer = 1;
            }
        }
    }

    public void button71(View view) {
        if (currentGame == 0) currentGame = 1;
        if (currentGame != 7) return;
        else {
            game7[1][1] = currentPlayer;
            currentGame = 1;
            button71.setEnabled(false);
            activeGame1();
            if (currentPlayer == 1) {
                button71.setText("X");
                currentPlayer = 2;
            } else {
                button71.setText("O");
                currentPlayer = 1;
            }
        }
    }

    public void button72(View view) {
        if (currentGame == 0) currentGame = 2;
        if (currentGame != 7) return;
        else {
            game7[1][2] = currentPlayer;
            currentGame = 2;
            button72.setEnabled(false);
            activeGame2();
            if (currentPlayer == 1) {
                button72.setText("X");
                currentPlayer = 2;
            } else {
                button72.setText("O");
                currentPlayer = 1;
            }
        }
    }

    public void button73(View view) {
        if (currentGame == 0) currentGame = 3;
        if (currentGame != 7) return;
        else {
            game7[1][3] = currentPlayer;
            currentGame = 3;
            button73.setEnabled(false);
            activeGame3();
            if (currentPlayer == 1) {
                button73.setText("X");
                currentPlayer = 2;
            } else {
                button73.setText("O");
                currentPlayer = 1;
            }
        }
    }

    public void button74(View view) {
        if (currentGame == 0) currentGame = 1;
        if (currentGame != 8) return;
        else {
            game8[1][1] = currentPlayer;
            currentGame = 1;
            button74.setEnabled(false);
            activeGame1();
            if (currentPlayer == 1) {
                button74.setText("X");
                currentPlayer = 2;
            } else {
                button74.setText("O");
                currentPlayer = 1;
            }
        }
    }

    public void button75(View view) {
        if (currentGame == 0) currentGame = 2;
        if (currentGame != 8) return;
        else {
            game8[1][2] = currentPlayer;
            currentGame = 2;
            button75.setEnabled(false);
            activeGame2();
            if (currentPlayer == 1) {
                button75.setText("X");
                currentPlayer = 2;
            } else {
                button75.setText("O");
                currentPlayer = 1;
            }
        }
    }

    public void button76(View view) {
        if (currentGame == 0) currentGame = 3;
        if (currentGame != 8) return;
        else {
            game8[1][3] = currentPlayer;
            currentGame = 3;
            button76.setEnabled(false);
            activeGame3();
            if (currentPlayer == 1) {
                button76.setText("X");
                currentPlayer = 2;
            } else {
                button76.setText("O");
                currentPlayer = 1;
            }
        }
    }

    public void button77(View view) {
        if (currentGame == 0) currentGame = 1;
        if (currentGame != 9) return;
        else {
            game9[1][1] = currentPlayer;
            currentGame = 1;
            button77.setEnabled(false);
            activeGame1();
            if (currentPlayer == 1) {
                button77.setText("X");
                currentPlayer = 2;
            } else {
                button77.setText("O");
                currentPlayer = 1;
            }
        }
    }

    public void button78(View view) {
        if (currentGame == 0) currentGame = 2;
        if (currentGame != 9) return;
        else {
            game9[1][2] = currentPlayer;
            currentGame = 2;
            button78.setEnabled(false);
            activeGame2();
            if (currentPlayer == 1) {
                button78.setText("X");
                currentPlayer = 2;
            } else {
                button78.setText("O");
                currentPlayer = 1;
            }
        }
    }

    public void button79(View view) {
        if (currentGame == 0) currentGame = 3;
        if (currentGame != 9) return;
        else {
            game9[1][3] = currentPlayer;
            currentGame = 3;
            button79.setEnabled(false);
            activeGame3();
            if (currentPlayer == 1) {
                button79.setText("X");
                currentPlayer = 2;
            } else {
                button79.setText("O");
                currentPlayer = 1;
            }
        }
    }

    public void button81(View view) {
        if (currentGame == 0) currentGame = 4;
        if (currentGame != 7) return;
        else {
            game7[2][1] = currentPlayer;
            currentGame = 4;
            button81.setEnabled(false);
            activeGame4();
            if (currentPlayer == 1) {
                button81.setText("X");
                currentPlayer = 2;
            } else {
                button81.setText("O");
                currentPlayer = 1;
            }
        }
    }

    public void button82(View view) {
        if (currentGame == 0) currentGame = 5;
        if (currentGame != 7) return;
        else {
            game7[2][2] = currentPlayer;
            currentGame = 5;
            button82.setEnabled(false);
            activeGame5();
            if (currentPlayer == 1) {
                button82.setText("X");
                currentPlayer = 2;
            } else {
                button82.setText("O");
                currentPlayer = 1;
            }
        }
    }

    public void button83(View view) {
        if (currentGame == 0) currentGame = 6;
        if (currentGame != 7) return;
        else {
            game7[2][3] = currentPlayer;
            currentGame = 6;
            button83.setEnabled(false);
            activeGame6();
            if (currentPlayer == 1) {
                button83.setText("X");
                currentPlayer = 2;
            } else {
                button83.setText("O");
                currentPlayer = 1;
            }
        }
    }

    public void button84(View view) {
        if (currentGame == 0) currentGame = 4;
        if (currentGame != 8) return;
        else {
            game8[2][1] = currentPlayer;
            currentGame = 4;
            button84.setEnabled(false);
            activeGame4();
            if (currentPlayer == 1) {
                button84.setText("X");
                currentPlayer = 2;
            } else {
                button84.setText("O");
                currentPlayer = 1;
            }
        }
    }

    public void button85(View view) {
        if (currentGame == 0) currentGame = 5;
        if (currentGame != 8) return;
        else {
            game8[2][2] = currentPlayer;
            currentGame = 5;
            button85.setEnabled(false);
            activeGame5();
            if (currentPlayer == 1) {
                button85.setText("X");
                currentPlayer = 2;
            } else {
                button85.setText("O");
                currentPlayer = 1;
            }
        }
    }

    public void button86(View view) {
        if (currentGame == 0) currentGame = 6;
        if (currentGame != 8) return;
        else {
            game8[2][3] = currentPlayer;
            currentGame = 6;
            button86.setEnabled(false);
            activeGame6();
            if (currentPlayer == 1) {
                button86.setText("X");
                currentPlayer = 2;
            } else {
                button86.setText("O");
                currentPlayer = 1;
            }
        }
    }

    public void button87(View view) {
        if (currentGame == 0) currentGame = 4;
        if (currentGame != 9) return;
        else {
            game9[2][1] = currentPlayer;
            currentGame = 4;
            button87.setEnabled(false);
            activeGame4();
            if (currentPlayer == 1) {
                button87.setText("X");
                currentPlayer = 2;
            } else {
                button87.setText("O");
                currentPlayer = 1;
            }
        }
    }

    public void button88(View view) {
        if (currentGame == 0) currentGame = 5;
        if (currentGame != 9) return;
        else {
            game9[2][2] = currentPlayer;
            currentGame = 5;
            button88.setEnabled(false);
            activeGame5();
            if (currentPlayer == 1) {
                button88.setText("X");
                currentPlayer = 2;
            } else {
                button88.setText("O");
                currentPlayer = 1;
            }
        }
    }

    public void button89(View view) {
        if (currentGame == 0) currentGame = 6;
        if (currentGame != 9) return;
        else {
            game9[2][3] = currentPlayer;
            currentGame = 6;
            button89.setEnabled(false);
            activeGame6();
            if (currentPlayer == 1) {
                button89.setText("X");
                currentPlayer = 2;
            } else {
                button89.setText("O");
                currentPlayer = 1;
            }
        }
    }

    public void button91(View view) {
        if (currentGame == 0) currentGame = 7;
        if (currentGame != 7) return;
        else {
            game7[3][1] = currentPlayer;
            currentGame = 7;
            button91.setEnabled(false);
            activeGame7();
            if (currentPlayer == 1) {
                button91.setText("X");
                currentPlayer = 2;
            } else {
                button91.setText("O");
                currentPlayer = 1;
            }
        }
    }

    public void button92(View view) {
        if (currentGame == 0) currentGame = 8;
        if (currentGame != 7) return;
        else {
            game7[3][2] = currentPlayer;
            currentGame = 8;
            button92.setEnabled(false);
            activeGame8();
            if (currentPlayer == 1) {
                button92.setText("X");
                currentPlayer = 2;
            } else {
                button92.setText("O");
                currentPlayer = 1;
            }
        }
    }

    public void button93(View view) {
        if (currentGame == 0) currentGame = 9;
        if (currentGame != 7) return;
        else {
            game7[3][3] = currentPlayer;
            currentGame = 9;
            button93.setEnabled(false);
            activeGame9();
            if (currentPlayer == 1) {
                button93.setText("X");
                currentPlayer = 2;
            } else {
                button93.setText("O");
                currentPlayer = 1;
            }
        }
    }

    public void button94(View view) {
        if (currentGame == 0) currentGame = 7;
        if (currentGame != 8) return;
        else {
            game8[3][1] = currentPlayer;
            currentGame = 7;
            button94.setEnabled(false);
            activeGame7();
            if (currentPlayer == 1) {
                button94.setText("X");
                currentPlayer = 2;
            } else {
                button94.setText("O");
                currentPlayer = 1;
            }
        }
    }

    public void button95(View view) {
        if (currentGame == 0) currentGame = 8;
        if (currentGame != 8) return;
        else {
            game8[3][2] = currentPlayer;
            currentGame = 8;
            button95.setEnabled(false);
            activeGame8();
            if (currentPlayer == 1) {
                button95.setText("X");
                currentPlayer = 2;
            } else {
                button95.setText("O");
                currentPlayer = 1;
            }
        }
    }

    public void button96(View view) {
        if (currentGame == 0) currentGame = 9;
        if (currentGame != 8) return;
        else {
            game8[3][3] = currentPlayer;
            currentGame = 9;
            button96.setEnabled(false);
            activeGame9();
            if (currentPlayer == 1) {
                button96.setText("X");
                currentPlayer = 2;
            } else {
                button96.setText("O");
                currentPlayer = 1;
            }
        }
    }

    public void button97(View view) {
        if (currentGame == 0) currentGame = 7;
        if (currentGame != 9) return;
        else {
            game9[3][1] = currentPlayer;
            currentGame = 7;
            button97.setEnabled(false);
            activeGame7();
            if (currentPlayer == 1) {
                button97.setText("X");
                currentPlayer = 2;
            } else {
                button97.setText("O");
                currentPlayer = 1;
            }
        }
    }

    public void button98(View view) {
        if (currentGame == 0) currentGame = 8;
        if (currentGame != 9) return;
        else {
            game9[3][2] = currentPlayer;
            currentGame = 8;
            button98.setEnabled(false);
            activeGame8();
            if (currentPlayer == 1) {
                button98.setText("X");
                currentPlayer = 2;
            } else {
                button98.setText("O");
                currentPlayer = 1;
            }
        }
    }

    public void button99(View view) {
        if (currentGame == 0) currentGame = 9;
        if (currentGame != 9) return;
        else {
            game9[3][3] = currentPlayer;
            currentGame = 9;
            button99.setEnabled(false);
            activeGame9();
            if (currentPlayer == 1) {
                button99.setText("X");
                currentPlayer = 2;
            } else {
                button99.setText("O");
                currentPlayer = 1;
            }
        }
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

    //todo method that checks each game is won


}
