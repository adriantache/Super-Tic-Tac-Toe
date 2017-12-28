package com.adriantache.supertictactoe;

import android.graphics.LightingColorFilter;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    //todo remove test tag and log entries
    private static final String TAG = "MainActivity";

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

    //declare mute imageview
    ImageView mute;

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
    boolean musicStop = true;
    MediaPlayer mediaPlayer;


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

        //find mute ImageView
        mute = findViewById(R.id.mute);

        //start music
        musicPlayer();
    }

    //this may not be necessary; stops music on destroy
    @Override
    public void onDestroy() {
        mediaPlayer.stop();
        if (mediaPlayer != null) {
            mediaPlayer.release();
            mediaPlayer = null;
        }

        super.onDestroy();
    }

    //stop music on screen off
    @Override
    protected void onPause() {
        super.onPause();

        if (mediaPlayer != null) {
            mediaPlayer.stop();
            mediaPlayer.release();
            mediaPlayer = null;
            musicStop = false;

            //change ImageView icon to allow restarting music
            mute.setImageDrawable(getResources().getDrawable(android.R.drawable.ic_media_play));
        }
    }

    //method to start music player
    public void musicPlayer() {
        mediaPlayer = MediaPlayer.create(this, R.raw.nihilore_bush_week);
        mediaPlayer.setLooping(true);
        mediaPlayer.start();
    }

    //method to mute/restart music
    public void musicToggle(View view) {
        if (musicStop && mediaPlayer != null) {
            mediaPlayer.stop();
            mediaPlayer.release();
            mediaPlayer = null;
            musicStop = false;
            //change ImageView icon
            mute.setImageDrawable(getResources().getDrawable(android.R.drawable.ic_media_play));
        } else {
            mediaPlayer = MediaPlayer.create(this, R.raw.nihilore_bush_week);
            mediaPlayer.setLooping(true);
            mediaPlayer.start();
            musicStop = true;
            mute.setImageDrawable(getResources().getDrawable(android.R.drawable.ic_lock_silent_mode));
        }
    }

    //all 81 methods for the individual buttons
    public void button11(View view) {
        //if the game has just started, or the selected board is not playable, allow player to click this button
        if (currentGame == 0) currentGame = 1;
        //if the current playable board is not this one, do nothing
        if (currentGame != 1) return;

        else {
            //set matrix to current player
            game1[1][1] = currentPlayer;
            // set current playable board to the appropriate one
            currentGame = 1;
            // disable this button
            button11.setEnabled(false);
            // set background colour for appropriate game board
            activeGame1();
            // set button text to current player symbol
            if (currentPlayer == 1) {
                button11.setText("X");
                checkGame1Win();
                currentPlayer = 2;
            } else {
                button11.setText("O");
                checkGame1Win();
                currentPlayer = 1;
            }
        }
    }

    public void button12(View view) {
        if (currentGame == 0) currentGame = 1;
        if (currentGame != 1) return;
        else {
            game1[1][2] = currentPlayer;
            currentGame = 2;
            button12.setEnabled(false);
            activeGame2();
            if (currentPlayer == 1) {
                button12.setText("X");
                checkGame1Win();
                currentPlayer = 2;
            } else {
                button12.setText("O");
                checkGame1Win();
                currentPlayer = 1;
            }
        }
    }

    public void button13(View view) {
        if (currentGame == 0) currentGame = 1;
        if (currentGame != 1) return;
        else {
            game1[1][3] = currentPlayer;
            currentGame = 3;
            button13.setEnabled(false);
            activeGame3();
            if (currentPlayer == 1) {
                button13.setText("X");
                checkGame1Win();
                currentPlayer = 2;
            } else {
                button13.setText("O");
                checkGame1Win();
                currentPlayer = 1;
            }
        }
    }

    public void button14(View view) {
        if (currentGame == 0) currentGame = 2;
        if (currentGame != 2) return;
        else {
            game2[1][1] = currentPlayer;
            currentGame = 1;
            button14.setEnabled(false);
            activeGame1();
            if (currentPlayer == 1) {
                button14.setText("X");
                checkGame2Win();
                currentPlayer = 2;
            } else {
                button14.setText("O");
                checkGame2Win();
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
                checkGame2Win();
                currentPlayer = 2;
            } else {
                button15.setText("O");
                checkGame2Win();
                currentPlayer = 1;
            }
        }
    }

    public void button16(View view) {
        if (currentGame == 0) currentGame = 2;
        if (currentGame != 2) return;
        else {
            game2[1][3] = currentPlayer;
            currentGame = 3;
            button16.setEnabled(false);
            activeGame3();
            if (currentPlayer == 1) {
                button16.setText("X");
                checkGame2Win();
                currentPlayer = 2;
            } else {
                button16.setText("O");
                checkGame2Win();
                currentPlayer = 1;
            }
        }
    }

    public void button17(View view) {
        if (currentGame == 0) currentGame = 3;
        if (currentGame != 3) return;
        else {
            game3[1][1] = currentPlayer;
            currentGame = 1;
            button17.setEnabled(false);
            activeGame1();
            if (currentPlayer == 1) {
                button17.setText("X");
                checkGame3Win();
                currentPlayer = 2;
            } else {
                button17.setText("O");
                checkGame3Win();
                currentPlayer = 1;
            }
        }
    }

    public void button18(View view) {
        if (currentGame == 0) currentGame = 3;
        if (currentGame != 3) return;
        else {
            game3[1][2] = currentPlayer;
            currentGame = 2;
            button18.setEnabled(false);
            activeGame2();
            if (currentPlayer == 1) {
                button18.setText("X");
                checkGame3Win();
                currentPlayer = 2;
            } else {
                button18.setText("O");
                checkGame3Win();
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
                checkGame3Win();
                currentPlayer = 2;
            } else {
                button19.setText("O");
                checkGame3Win();
                currentPlayer = 1;
            }
        }
    }

    public void button21(View view) {
        if (currentGame == 0) currentGame = 1;
        if (currentGame != 1) return;
        else {
            game1[2][1] = currentPlayer;
            currentGame = 4;
            button21.setEnabled(false);
            activeGame4();
            if (currentPlayer == 1) {
                button21.setText("X");
                checkGame1Win();
                currentPlayer = 2;
            } else {
                button21.setText("O");
                checkGame1Win();
                currentPlayer = 1;
            }
        }
    }

    public void button22(View view) {
        if (currentGame == 0) currentGame = 1;
        if (currentGame != 1) return;
        else {
            game1[2][2] = currentPlayer;
            currentGame = 5;
            button22.setEnabled(false);
            activeGame5();
            if (currentPlayer == 1) {
                button22.setText("X");
                checkGame1Win();
                currentPlayer = 2;
            } else {
                button22.setText("O");
                checkGame1Win();
                currentPlayer = 1;
            }
        }
    }

    public void button23(View view) {
        if (currentGame == 0) currentGame = 1;
        if (currentGame != 1) return;
        else {
            game1[2][3] = currentPlayer;
            currentGame = 6;
            button23.setEnabled(false);
            activeGame6();
            if (currentPlayer == 1) {
                button23.setText("X");
                checkGame1Win();
                currentPlayer = 2;
            } else {
                button23.setText("O");
                checkGame1Win();
                currentPlayer = 1;
            }
        }
    }

    public void button24(View view) {
        if (currentGame == 0) currentGame = 2;
        if (currentGame != 2) return;
        else {
            game2[2][1] = currentPlayer;
            currentGame = 4;
            button24.setEnabled(false);
            activeGame4();
            if (currentPlayer == 1) {
                button24.setText("X");
                checkGame2Win();
                currentPlayer = 2;
            } else {
                button24.setText("O");
                checkGame2Win();
                currentPlayer = 1;
            }
        }
    }

    public void button25(View view) {
        if (currentGame == 0) currentGame = 2;
        if (currentGame != 2) return;
        else {
            game2[2][2] = currentPlayer;
            currentGame = 5;
            button25.setEnabled(false);
            activeGame5();
            if (currentPlayer == 1) {
                button25.setText("X");
                checkGame2Win();
                currentPlayer = 2;
            } else {
                button25.setText("O");
                checkGame2Win();
                currentPlayer = 1;
            }
        }
    }

    public void button26(View view) {
        if (currentGame == 0) currentGame = 2;
        if (currentGame != 2) return;
        else {
            game2[2][3] = currentPlayer;
            currentGame = 6;
            button26.setEnabled(false);
            activeGame6();
            if (currentPlayer == 1) {
                button26.setText("X");
                checkGame2Win();
                currentPlayer = 2;
            } else {
                button26.setText("O");
                checkGame2Win();
                currentPlayer = 1;
            }
        }
    }

    public void button27(View view) {
        if (currentGame == 0) currentGame = 3;
        if (currentGame != 3) return;
        else {
            game3[2][1] = currentPlayer;
            currentGame = 4;
            button27.setEnabled(false);
            activeGame4();
            if (currentPlayer == 1) {
                button27.setText("X");
                checkGame3Win();
                currentPlayer = 2;
            } else {
                button27.setText("O");
                checkGame3Win();
                currentPlayer = 1;
            }
        }
    }

    public void button28(View view) {
        if (currentGame == 0) currentGame = 3;
        if (currentGame != 3) return;
        else {
            game3[2][2] = currentPlayer;
            currentGame = 5;
            button28.setEnabled(false);
            activeGame5();
            if (currentPlayer == 1) {
                button28.setText("X");
                checkGame3Win();
                currentPlayer = 2;
            } else {
                button28.setText("O");
                checkGame3Win();
                currentPlayer = 1;
            }
        }
    }

    public void button29(View view) {
        if (currentGame == 0) currentGame = 3;
        if (currentGame != 3) return;
        else {
            game3[2][3] = currentPlayer;
            currentGame = 6;
            button29.setEnabled(false);
            activeGame6();
            if (currentPlayer == 1) {
                button29.setText("X");
                checkGame3Win();
                currentPlayer = 2;
            } else {
                button29.setText("O");
                checkGame3Win();
                currentPlayer = 1;
            }
        }
    }

    public void button31(View view) {
        if (currentGame == 0) currentGame = 1;
        if (currentGame != 1) return;
        else {
            game1[3][1] = currentPlayer;
            currentGame = 7;
            button31.setEnabled(false);
            activeGame7();
            if (currentPlayer == 1) {
                button31.setText("X");
                checkGame1Win();
                currentPlayer = 2;
            } else {
                button31.setText("O");
                checkGame1Win();
                currentPlayer = 1;
            }
        }
    }

    public void button32(View view) {
        if (currentGame == 0) currentGame = 1;
        if (currentGame != 1) return;
        else {
            game1[3][2] = currentPlayer;
            currentGame = 8;
            button32.setEnabled(false);
            activeGame8();
            if (currentPlayer == 1) {
                button32.setText("X");
                checkGame1Win();
                currentPlayer = 2;
            } else {
                button32.setText("O");
                checkGame1Win();
                currentPlayer = 1;
            }
        }
    }

    public void button33(View view) {
        if (currentGame == 0) currentGame = 1;
        if (currentGame != 1) return;
        else {
            game1[3][3] = currentPlayer;
            currentGame = 9;
            button33.setEnabled(false);
            activeGame9();
            if (currentPlayer == 1) {
                button33.setText("X");
                checkGame1Win();
                currentPlayer = 2;
            } else {
                button33.setText("O");
                checkGame1Win();
                currentPlayer = 1;
            }
        }
    }

    public void button34(View view) {
        if (currentGame == 0) currentGame = 2;
        if (currentGame != 2) return;
        else {
            game2[3][1] = currentPlayer;
            currentGame = 7;
            button34.setEnabled(false);
            activeGame7();
            if (currentPlayer == 1) {
                button34.setText("X");
                checkGame2Win();
                currentPlayer = 2;
            } else {
                button34.setText("O");
                checkGame2Win();
                currentPlayer = 1;
            }
        }
    }

    public void button35(View view) {
        if (currentGame == 0) currentGame = 2;
        if (currentGame != 2) return;
        else {
            game2[3][2] = currentPlayer;
            currentGame = 8;
            button35.setEnabled(false);
            activeGame8();
            if (currentPlayer == 1) {
                button35.setText("X");
                checkGame2Win();
                currentPlayer = 2;
            } else {
                button35.setText("O");
                checkGame2Win();
                currentPlayer = 1;
            }
        }
    }

    public void button36(View view) {
        if (currentGame == 0) currentGame = 2;
        if (currentGame != 2) return;
        else {
            game2[3][3] = currentPlayer;
            currentGame = 9;
            button36.setEnabled(false);
            activeGame9();
            if (currentPlayer == 1) {
                button36.setText("X");
                checkGame2Win();
                currentPlayer = 2;
            } else {
                button36.setText("O");
                checkGame2Win();
                currentPlayer = 1;
            }
        }
    }

    public void button37(View view) {
        if (currentGame == 0) currentGame = 3;
        if (currentGame != 3) return;
        else {
            game3[3][1] = currentPlayer;
            currentGame = 7;
            button37.setEnabled(false);
            activeGame7();
            if (currentPlayer == 1) {
                button37.setText("X");
                checkGame3Win();
                currentPlayer = 2;
            } else {
                button37.setText("O");
                checkGame3Win();
                currentPlayer = 1;
            }
        }
    }

    public void button38(View view) {
        if (currentGame == 0) currentGame = 3;
        if (currentGame != 3) return;
        else {
            game3[3][2] = currentPlayer;
            currentGame = 8;
            button38.setEnabled(false);
            activeGame8();
            if (currentPlayer == 1) {
                button38.setText("X");
                checkGame3Win();
                currentPlayer = 2;
            } else {
                button38.setText("O");
                checkGame3Win();
                currentPlayer = 1;
            }
        }
    }

    public void button39(View view) {
        if (currentGame == 0) currentGame = 3;
        if (currentGame != 3) return;
        else {
            game3[3][3] = currentPlayer;
            currentGame = 9;
            button39.setEnabled(false);
            activeGame9();
            if (currentPlayer == 1) {
                button39.setText("X");
                checkGame3Win();
                currentPlayer = 2;
            } else {
                button39.setText("O");
                checkGame3Win();
                currentPlayer = 1;
            }
        }
    }

    public void button41(View view) {
        if (currentGame == 0) currentGame = 4;
        if (currentGame != 4) return;
        else {
            game4[1][1] = currentPlayer;
            currentGame = 1;
            button41.setEnabled(false);
            activeGame1();
            if (currentPlayer == 1) {
                button41.setText("X");
                checkGame4Win();
                currentPlayer = 2;
            } else {
                button41.setText("O");
                checkGame4Win();
                currentPlayer = 1;
            }
        }
    }

    public void button42(View view) {
        if (currentGame == 0) currentGame = 4;
        if (currentGame != 4) return;
        else {
            game4[1][2] = currentPlayer;
            currentGame = 2;
            button42.setEnabled(false);
            activeGame2();
            if (currentPlayer == 1) {
                button42.setText("X");
                checkGame4Win();
                currentPlayer = 2;
            } else {
                button42.setText("O");
                checkGame4Win();
                currentPlayer = 1;
            }
        }
    }

    public void button43(View view) {
        if (currentGame == 0) currentGame = 4;
        if (currentGame != 4) return;
        else {
            game4[1][3] = currentPlayer;
            currentGame = 3;
            button43.setEnabled(false);
            activeGame3();
            if (currentPlayer == 1) {
                button43.setText("X");
                checkGame4Win();
                currentPlayer = 2;
            } else {
                button43.setText("O");
                checkGame4Win();
                currentPlayer = 1;
            }
        }
    }

    public void button44(View view) {
        if (currentGame == 0) currentGame = 5;
        if (currentGame != 5) return;
        else {
            game5[1][1] = currentPlayer;
            currentGame = 1;
            button44.setEnabled(false);
            activeGame1();
            if (currentPlayer == 1) {
                button44.setText("X");
                checkGame5Win();
                currentPlayer = 2;
            } else {
                button44.setText("O");
                checkGame5Win();
                currentPlayer = 1;
            }
        }
    }

    public void button45(View view) {
        if (currentGame == 0) currentGame = 5;
        if (currentGame != 5) return;
        else {
            game5[1][2] = currentPlayer;
            currentGame = 2;
            button45.setEnabled(false);
            activeGame2();
            if (currentPlayer == 1) {
                button45.setText("X");
                checkGame5Win();
                currentPlayer = 2;
            } else {
                button45.setText("O");
                checkGame5Win();
                currentPlayer = 1;
            }
        }
    }

    public void button46(View view) {
        if (currentGame == 0) currentGame = 5;
        if (currentGame != 5) return;
        else {
            game5[1][3] = currentPlayer;
            currentGame = 3;
            button46.setEnabled(false);
            activeGame3();
            if (currentPlayer == 1) {
                button46.setText("X");
                checkGame5Win();
                currentPlayer = 2;
            } else {
                button46.setText("O");
                checkGame5Win();
                currentPlayer = 1;
            }
        }
    }

    public void button47(View view) {
        if (currentGame == 0) currentGame = 6;
        if (currentGame != 6) return;
        else {
            game6[1][1] = currentPlayer;
            currentGame = 1;
            button47.setEnabled(false);
            activeGame1();
            if (currentPlayer == 1) {
                button47.setText("X");
                checkGame6Win();
                currentPlayer = 2;
            } else {
                button47.setText("O");
                checkGame6Win();
                currentPlayer = 1;
            }
        }
    }

    public void button48(View view) {
        if (currentGame == 0) currentGame = 6;
        if (currentGame != 6) return;
        else {
            game6[1][2] = currentPlayer;
            currentGame = 2;
            button48.setEnabled(false);
            activeGame2();
            if (currentPlayer == 1) {
                button48.setText("X");
                checkGame6Win();
                currentPlayer = 2;
            } else {
                button48.setText("O");
                checkGame6Win();
                currentPlayer = 1;
            }
        }
    }

    public void button49(View view) {
        if (currentGame == 0) currentGame = 6;
        if (currentGame != 6) return;
        else {
            game6[1][3] = currentPlayer;
            currentGame = 3;
            button49.setEnabled(false);
            activeGame3();
            if (currentPlayer == 1) {
                button49.setText("X");
                checkGame6Win();
                currentPlayer = 2;
            } else {
                button49.setText("O");
                checkGame6Win();
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
                checkGame4Win();
                currentPlayer = 2;
            } else {
                button51.setText("O");
                checkGame4Win();
                currentPlayer = 1;
            }
        }
    }

    public void button52(View view) {
        if (currentGame == 0) currentGame = 4;
        if (currentGame != 4) return;
        else {
            game4[2][2] = currentPlayer;
            currentGame = 5;
            button52.setEnabled(false);
            activeGame5();
            if (currentPlayer == 1) {
                button52.setText("X");
                checkGame4Win();
                currentPlayer = 2;
            } else {
                button52.setText("O");
                checkGame4Win();
                currentPlayer = 1;
            }
        }
    }

    public void button53(View view) {
        if (currentGame == 0) currentGame = 4;
        if (currentGame != 4) return;
        else {
            game4[2][3] = currentPlayer;
            currentGame = 6;
            button53.setEnabled(false);
            activeGame6();
            if (currentPlayer == 1) {
                button53.setText("X");
                checkGame4Win();
                currentPlayer = 2;
            } else {
                button53.setText("O");
                checkGame4Win();
                currentPlayer = 1;
            }
        }
    }

    public void button54(View view) {
        if (currentGame == 0) currentGame = 5;
        if (currentGame != 5) return;
        else {
            game5[2][1] = currentPlayer;
            currentGame = 4;
            button54.setEnabled(false);
            activeGame4();
            if (currentPlayer == 1) {
                button54.setText("X");
                checkGame5Win();
                currentPlayer = 2;
            } else {
                button54.setText("O");
                checkGame5Win();
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
                checkGame5Win();
                currentPlayer = 2;
            } else {
                button55.setText("O");
                checkGame5Win();
                currentPlayer = 1;
            }
        }
    }

    public void button56(View view) {
        if (currentGame == 0) currentGame = 5;
        if (currentGame != 5) return;
        else {
            game5[2][3] = currentPlayer;
            currentGame = 6;
            button56.setEnabled(false);
            activeGame6();
            if (currentPlayer == 1) {
                button56.setText("X");
                checkGame5Win();
                currentPlayer = 2;
            } else {
                button56.setText("O");
                checkGame5Win();
                currentPlayer = 1;
            }
        }
    }

    public void button57(View view) {
        if (currentGame == 0) currentGame = 6;
        if (currentGame != 6) return;
        else {
            game6[2][1] = currentPlayer;
            currentGame = 4;
            button57.setEnabled(false);
            activeGame4();
            if (currentPlayer == 1) {
                button57.setText("X");
                checkGame6Win();
                currentPlayer = 2;
            } else {
                button57.setText("O");
                checkGame6Win();
                currentPlayer = 1;
            }
        }
    }

    public void button58(View view) {
        if (currentGame == 0) currentGame = 6;
        if (currentGame != 6) return;
        else {
            game6[2][2] = currentPlayer;
            currentGame = 5;
            button58.setEnabled(false);
            activeGame5();
            if (currentPlayer == 1) {
                button58.setText("X");
                checkGame6Win();
                currentPlayer = 2;
            } else {
                button58.setText("O");
                checkGame6Win();
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
                checkGame6Win();
                currentPlayer = 2;
            } else {
                button59.setText("O");
                checkGame6Win();
                currentPlayer = 1;
            }
        }
    }

    public void button61(View view) {
        if (currentGame == 0) currentGame = 4;
        if (currentGame != 4) return;
        else {
            game4[3][1] = currentPlayer;
            currentGame = 7;
            button61.setEnabled(false);
            activeGame7();
            if (currentPlayer == 1) {
                button61.setText("X");
                checkGame4Win();
                currentPlayer = 2;
            } else {
                button61.setText("O");
                checkGame4Win();
                currentPlayer = 1;
            }
        }
    }

    public void button62(View view) {
        if (currentGame == 0) currentGame = 4;
        if (currentGame != 4) return;
        else {
            game4[3][2] = currentPlayer;
            currentGame = 8;
            button62.setEnabled(false);
            activeGame8();
            if (currentPlayer == 1) {
                button62.setText("X");
                checkGame4Win();
                currentPlayer = 2;
            } else {
                button62.setText("O");
                checkGame4Win();
                currentPlayer = 1;
            }
        }
    }

    public void button63(View view) {
        if (currentGame == 0) currentGame = 4;
        if (currentGame != 4) return;
        else {
            game4[3][3] = currentPlayer;
            currentGame = 9;
            button63.setEnabled(false);
            activeGame9();
            if (currentPlayer == 1) {
                button63.setText("X");
                checkGame4Win();
                currentPlayer = 2;
            } else {
                button63.setText("O");
                checkGame4Win();
                currentPlayer = 1;
            }
        }
    }

    public void button64(View view) {
        if (currentGame == 0) currentGame = 5;
        if (currentGame != 5) return;
        else {
            game5[3][1] = currentPlayer;
            currentGame = 7;
            button64.setEnabled(false);
            activeGame7();
            if (currentPlayer == 1) {
                button64.setText("X");
                checkGame5Win();
                currentPlayer = 2;
            } else {
                button64.setText("O");
                checkGame5Win();
                currentPlayer = 1;
            }
        }
    }

    public void button65(View view) {
        if (currentGame == 0) currentGame = 5;
        if (currentGame != 5) return;
        else {
            game5[3][2] = currentPlayer;
            currentGame = 8;
            button65.setEnabled(false);
            activeGame8();
            if (currentPlayer == 1) {
                button65.setText("X");
                checkGame5Win();
                currentPlayer = 2;
            } else {
                button65.setText("O");
                checkGame5Win();
                currentPlayer = 1;
            }
        }
    }

    public void button66(View view) {
        if (currentGame == 0) currentGame = 5;
        if (currentGame != 5) return;
        else {
            game5[3][3] = currentPlayer;
            currentGame = 9;
            button66.setEnabled(false);
            activeGame9();
            if (currentPlayer == 1) {
                button66.setText("X");
                checkGame5Win();
                currentPlayer = 2;
            } else {
                button66.setText("O");
                checkGame5Win();
                currentPlayer = 1;
            }
        }
    }

    public void button67(View view) {
        if (currentGame == 0) currentGame = 6;
        if (currentGame != 6) return;
        else {
            game6[3][1] = currentPlayer;
            currentGame = 7;
            button67.setEnabled(false);
            activeGame7();
            if (currentPlayer == 1) {
                button67.setText("X");
                checkGame6Win();
                currentPlayer = 2;
            } else {
                button67.setText("O");
                checkGame6Win();
                currentPlayer = 1;
            }
        }
    }

    public void button68(View view) {
        if (currentGame == 0) currentGame = 6;
        if (currentGame != 6) return;
        else {
            game6[3][2] = currentPlayer;
            currentGame = 8;
            button68.setEnabled(false);
            activeGame8();
            if (currentPlayer == 1) {
                button68.setText("X");
                checkGame6Win();
                currentPlayer = 2;
            } else {
                button68.setText("O");
                checkGame6Win();
                currentPlayer = 1;
            }
        }
    }

    public void button69(View view) {
        if (currentGame == 0) currentGame = 6;
        if (currentGame != 6) return;
        else {
            game6[3][3] = currentPlayer;
            currentGame = 9;
            button69.setEnabled(false);
            activeGame9();
            if (currentPlayer == 1) {
                button69.setText("X");
                checkGame6Win();
                currentPlayer = 2;
            } else {
                button69.setText("O");
                checkGame6Win();
                currentPlayer = 1;
            }
        }
    }

    public void button71(View view) {
        if (currentGame == 0) currentGame = 7;
        if (currentGame != 7) return;
        else {
            game7[1][1] = currentPlayer;
            currentGame = 1;
            button71.setEnabled(false);
            activeGame1();
            if (currentPlayer == 1) {
                button71.setText("X");
                checkGame7Win();
                currentPlayer = 2;
            } else {
                button71.setText("O");
                checkGame7Win();
                currentPlayer = 1;
            }
        }
    }

    public void button72(View view) {
        if (currentGame == 0) currentGame = 7;
        if (currentGame != 7) return;
        else {
            game7[1][2] = currentPlayer;
            currentGame = 2;
            button72.setEnabled(false);
            activeGame2();
            if (currentPlayer == 1) {
                button72.setText("X");
                checkGame7Win();
                currentPlayer = 2;
            } else {
                button72.setText("O");
                checkGame7Win();
                currentPlayer = 1;
            }
        }
    }

    public void button73(View view) {
        if (currentGame == 0) currentGame = 7;
        if (currentGame != 7) return;
        else {
            game7[1][3] = currentPlayer;
            currentGame = 3;
            button73.setEnabled(false);
            activeGame3();
            if (currentPlayer == 1) {
                button73.setText("X");
                checkGame7Win();
                currentPlayer = 2;
            } else {
                button73.setText("O");
                checkGame7Win();
                currentPlayer = 1;
            }
        }
    }

    public void button74(View view) {
        if (currentGame == 0) currentGame = 8;
        if (currentGame != 8) return;
        else {
            game8[1][1] = currentPlayer;
            currentGame = 1;
            button74.setEnabled(false);
            activeGame1();
            if (currentPlayer == 1) {
                button74.setText("X");
                checkGame8Win();
                currentPlayer = 2;
            } else {
                button74.setText("O");
                checkGame8Win();
                currentPlayer = 1;
            }
        }
    }

    public void button75(View view) {
        if (currentGame == 0) currentGame = 8;
        if (currentGame != 8) return;
        else {
            game8[1][2] = currentPlayer;
            currentGame = 2;
            button75.setEnabled(false);
            activeGame2();
            if (currentPlayer == 1) {
                button75.setText("X");
                checkGame8Win();
                currentPlayer = 2;
            } else {
                button75.setText("O");
                checkGame8Win();
                currentPlayer = 1;
            }
        }
    }

    public void button76(View view) {
        if (currentGame == 0) currentGame = 8;
        if (currentGame != 8) return;
        else {
            game8[1][3] = currentPlayer;
            currentGame = 3;
            button76.setEnabled(false);
            activeGame3();
            if (currentPlayer == 1) {
                button76.setText("X");
                checkGame8Win();
                currentPlayer = 2;
            } else {
                button76.setText("O");
                checkGame8Win();
                currentPlayer = 1;
            }
        }
    }

    public void button77(View view) {
        if (currentGame == 0) currentGame = 9;
        if (currentGame != 9) return;
        else {
            game9[1][1] = currentPlayer;
            currentGame = 1;
            button77.setEnabled(false);
            activeGame1();
            if (currentPlayer == 1) {
                button77.setText("X");
                checkGame9Win();
                currentPlayer = 2;
            } else {
                button77.setText("O");
                checkGame9Win();
                currentPlayer = 1;
            }
        }
    }

    public void button78(View view) {
        if (currentGame == 0) currentGame = 9;
        if (currentGame != 9) return;
        else {
            game9[1][2] = currentPlayer;
            currentGame = 2;
            button78.setEnabled(false);
            activeGame2();
            if (currentPlayer == 1) {
                button78.setText("X");
                checkGame9Win();
                currentPlayer = 2;
            } else {
                button78.setText("O");
                checkGame9Win();
                currentPlayer = 1;
            }
        }
    }

    public void button79(View view) {
        if (currentGame == 0) currentGame = 9;
        if (currentGame != 9) return;
        else {
            game9[1][3] = currentPlayer;
            currentGame = 3;
            button79.setEnabled(false);
            activeGame3();
            if (currentPlayer == 1) {
                button79.setText("X");
                checkGame9Win();
                currentPlayer = 2;
            } else {
                button79.setText("O");
                checkGame9Win();
                currentPlayer = 1;
            }
        }
    }

    public void button81(View view) {
        if (currentGame == 0) currentGame = 7;
        if (currentGame != 7) return;
        else {
            game7[2][1] = currentPlayer;
            currentGame = 4;
            button81.setEnabled(false);
            activeGame4();
            if (currentPlayer == 1) {
                button81.setText("X");
                checkGame7Win();
                currentPlayer = 2;
            } else {
                button81.setText("O");
                checkGame7Win();
                currentPlayer = 1;
            }
        }
    }

    public void button82(View view) {
        if (currentGame == 0) currentGame = 7;
        if (currentGame != 7) return;
        else {
            game7[2][2] = currentPlayer;
            currentGame = 5;
            button82.setEnabled(false);
            activeGame5();
            if (currentPlayer == 1) {
                button82.setText("X");
                checkGame7Win();
                currentPlayer = 2;
            } else {
                button82.setText("O");
                checkGame7Win();
                currentPlayer = 1;
            }
        }
    }

    public void button83(View view) {
        if (currentGame == 0) currentGame = 7;
        if (currentGame != 7) return;
        else {
            game7[2][3] = currentPlayer;
            currentGame = 6;
            button83.setEnabled(false);
            activeGame6();
            if (currentPlayer == 1) {
                button83.setText("X");
                checkGame7Win();
                currentPlayer = 2;
            } else {
                button83.setText("O");
                checkGame7Win();
                currentPlayer = 1;
            }
        }
    }

    public void button84(View view) {
        if (currentGame == 0) currentGame = 8;
        if (currentGame != 8) return;
        else {
            game8[2][1] = currentPlayer;
            currentGame = 4;
            button84.setEnabled(false);
            activeGame4();
            if (currentPlayer == 1) {
                button84.setText("X");
                checkGame8Win();
                currentPlayer = 2;
            } else {
                button84.setText("O");
                checkGame8Win();
                currentPlayer = 1;
            }
        }
    }

    public void button85(View view) {
        if (currentGame == 0) currentGame = 8;
        if (currentGame != 8) return;
        else {
            game8[2][2] = currentPlayer;
            currentGame = 5;
            button85.setEnabled(false);
            activeGame5();
            if (currentPlayer == 1) {
                button85.setText("X");
                checkGame8Win();
                currentPlayer = 2;
            } else {
                button85.setText("O");
                checkGame8Win();
                currentPlayer = 1;
            }
        }
    }

    public void button86(View view) {
        if (currentGame == 0) currentGame = 8;
        if (currentGame != 8) return;
        else {
            game8[2][3] = currentPlayer;
            currentGame = 6;
            button86.setEnabled(false);
            activeGame6();
            if (currentPlayer == 1) {
                button86.setText("X");
                checkGame8Win();
                currentPlayer = 2;
            } else {
                button86.setText("O");
                checkGame8Win();
                currentPlayer = 1;
            }
        }
    }

    public void button87(View view) {
        if (currentGame == 0) currentGame = 9;
        if (currentGame != 9) return;
        else {
            game9[2][1] = currentPlayer;
            currentGame = 4;
            button87.setEnabled(false);
            activeGame4();
            if (currentPlayer == 1) {
                button87.setText("X");
                checkGame9Win();
                currentPlayer = 2;
            } else {
                button87.setText("O");
                checkGame9Win();
                currentPlayer = 1;
            }
        }
    }

    public void button88(View view) {
        if (currentGame == 0) currentGame = 9;
        if (currentGame != 9) return;
        else {
            game9[2][2] = currentPlayer;
            currentGame = 5;
            button88.setEnabled(false);
            activeGame5();
            if (currentPlayer == 1) {
                button88.setText("X");
                checkGame9Win();
                currentPlayer = 2;
            } else {
                button88.setText("O");
                checkGame9Win();
                currentPlayer = 1;
            }
        }
    }

    public void button89(View view) {
        if (currentGame == 0) currentGame = 9;
        if (currentGame != 9) return;
        else {
            game9[2][3] = currentPlayer;
            currentGame = 6;
            button89.setEnabled(false);
            activeGame6();
            if (currentPlayer == 1) {
                button89.setText("X");
                checkGame9Win();
                currentPlayer = 2;
            } else {
                button89.setText("O");
                checkGame9Win();
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
                checkGame7Win();
                currentPlayer = 2;
            } else {
                button91.setText("O");
                checkGame7Win();
                currentPlayer = 1;
            }
        }
    }

    public void button92(View view) {
        if (currentGame == 0) currentGame = 7;
        if (currentGame != 7) return;
        else {
            game7[3][2] = currentPlayer;
            currentGame = 8;
            button92.setEnabled(false);
            activeGame8();
            if (currentPlayer == 1) {
                button92.setText("X");
                checkGame7Win();
                currentPlayer = 2;
            } else {
                button92.setText("O");
                checkGame7Win();
                currentPlayer = 1;
            }
        }
    }

    public void button93(View view) {
        if (currentGame == 0) currentGame = 7;
        if (currentGame != 7) return;
        else {
            game7[3][3] = currentPlayer;
            currentGame = 9;
            button93.setEnabled(false);
            activeGame9();
            if (currentPlayer == 1) {
                button93.setText("X");
                checkGame7Win();
                currentPlayer = 2;
            } else {
                button93.setText("O");
                checkGame7Win();
                currentPlayer = 1;
            }
        }
    }

    public void button94(View view) {
        if (currentGame == 0) currentGame = 8;
        if (currentGame != 8) return;
        else {
            game8[3][1] = currentPlayer;
            currentGame = 7;
            button94.setEnabled(false);
            activeGame7();
            if (currentPlayer == 1) {
                button94.setText("X");
                checkGame8Win();
                currentPlayer = 2;
            } else {
                button94.setText("O");
                checkGame8Win();
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
                checkGame8Win();
                currentPlayer = 2;
            } else {
                button95.setText("O");
                checkGame8Win();
                currentPlayer = 1;
            }
        }
    }

    public void button96(View view) {
        if (currentGame == 0) currentGame = 8;
        if (currentGame != 8) return;
        else {
            game8[3][3] = currentPlayer;
            currentGame = 9;
            button96.setEnabled(false);
            activeGame9();
            if (currentPlayer == 1) {
                button96.setText("X");
                checkGame8Win();
                currentPlayer = 2;
            } else {
                button96.setText("O");
                checkGame8Win();
                currentPlayer = 1;
            }
        }
    }

    public void button97(View view) {
        if (currentGame == 0) currentGame = 9;
        if (currentGame != 9) return;
        else {
            game9[3][1] = currentPlayer;
            currentGame = 7;
            button97.setEnabled(false);
            activeGame7();
            if (currentPlayer == 1) {
                button97.setText("X");
                checkGame9Win();
                currentPlayer = 2;
            } else {
                button97.setText("O");
                checkGame9Win();
                currentPlayer = 1;
            }
        }
    }

    public void button98(View view) {
        if (currentGame == 0) currentGame = 9;
        if (currentGame != 9) return;
        else {
            game9[3][2] = currentPlayer;
            currentGame = 8;
            button98.setEnabled(false);
            activeGame8();
            if (currentPlayer == 1) {
                button98.setText("X");
                checkGame9Win();
                currentPlayer = 2;
            } else {
                button98.setText("O");
                checkGame9Win();
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
                checkGame9Win();
                currentPlayer = 2;
            } else {
                button99.setText("O");
                checkGame9Win();
                currentPlayer = 1;
            }
        }
    }

    //my own method to determine equality between multiple values because java
    private boolean allEqual(int a, int b, int c) {
        //return false if cells are empty
        if (a == 0 || b == 0 || c == 0) return false;
        //otherwise, return result
        return (a == b && b == c);
    }

    //methods to test individual board win
    public void checkGame1Win() {
        // if there is a win, codify current player into main matrix
        if (allEqual(game1[1][1], game1[1][2], game1[1][3]) || allEqual(game1[2][1], game1[2][2], game1[2][3]) || allEqual(game1[3][1], game1[3][2], game1[3][3]) || allEqual(game1[1][1], game1[2][2], game1[3][3]) || allEqual(game1[1][3], game1[2][2], game1[3][1]) || allEqual(game1[1][1], game1[2][1], game1[3][1]) || allEqual(game1[1][2], game1[2][2], game1[3][2]) || allEqual(game1[1][3], game1[2][3], game1[3][3])) {
            mainGame[1][1] = currentPlayer;
            // if cursor points to this board, allow all movement
            if (currentGame == 1) currentGame = 0;
            disableGame1();
            checkMainGameWin();
        }
    }

    public void checkGame2Win() {
        // if there is a win, codify current player into main matrix
        if (allEqual(game2[1][1], game2[1][2], game2[1][3]) || allEqual(game2[2][1], game2[2][2], game2[2][3]) || allEqual(game2[3][1], game2[3][2], game2[3][3]) || allEqual(game2[1][1], game2[2][2], game2[3][3]) || allEqual(game2[1][3], game2[2][2], game2[3][1]) || allEqual(game2[1][1], game2[2][1], game2[3][1]) || allEqual(game2[1][2], game2[2][2], game2[3][2]) || allEqual(game2[1][3], game2[2][3], game2[3][3])) {
            mainGame[1][2] = currentPlayer;
            // if cursor points to this board, allow all movement
            if (currentGame == 2) currentGame = 0;
            disableGame2();
            checkMainGameWin();
        }
    }

    public void checkGame3Win() {
        // if there is a win, codify current player into main matrix
        if (allEqual(game3[1][1], game3[1][2], game3[1][3]) || allEqual(game3[2][1], game3[2][2], game3[2][3]) || allEqual(game3[3][1], game3[3][2], game3[3][3]) || allEqual(game3[1][1], game3[2][2], game3[3][3]) || allEqual(game3[1][3], game3[2][2], game3[3][1]) || allEqual(game3[1][1], game3[2][1], game3[3][1]) || allEqual(game3[1][2], game3[2][2], game3[3][2]) || allEqual(game3[1][3], game3[2][3], game3[3][3])) {
            mainGame[1][3] = currentPlayer;
            // if cursor points to this board, allow all movement
            if (currentGame == 3) currentGame = 0;
            disableGame3();
            checkMainGameWin();
        }
    }

    public void checkGame4Win() {
        // if there is a win, codify current player into main matrix
        if (allEqual(game4[1][1], game4[1][2], game4[1][3]) || allEqual(game4[2][1], game4[2][2], game4[2][3]) || allEqual(game4[3][1], game4[3][2], game4[3][3]) || allEqual(game4[1][1], game4[2][2], game4[3][3]) || allEqual(game4[1][3], game4[2][2], game4[3][1]) || allEqual(game4[1][1], game4[2][1], game4[3][1]) || allEqual(game4[1][2], game4[2][2], game4[3][2]) || allEqual(game4[1][3], game4[2][3], game4[3][3])) {
            mainGame[2][1] = currentPlayer;
            // if cursor points to this board, allow all movement
            if (currentGame == 4) currentGame = 0;
            disableGame4();
            checkMainGameWin();
        }
    }

    public void checkGame5Win() {
        // if there is a win, codify current player into main matrix
        if (allEqual(game5[1][1], game5[1][2], game5[1][3]) || allEqual(game5[2][1], game5[2][2], game5[2][3]) || allEqual(game5[3][1], game5[3][2], game5[3][3]) || allEqual(game5[1][1], game5[2][2], game5[3][3]) || allEqual(game5[1][3], game5[2][2], game5[3][1]) || allEqual(game5[1][1], game5[2][1], game5[3][1]) || allEqual(game5[1][2], game5[2][2], game5[3][2]) || allEqual(game5[1][3], game5[2][3], game5[3][3])) {
            mainGame[2][2] = currentPlayer;
            // if cursor points to this board, allow all movement
            if (currentGame == 5) currentGame = 0;
            disableGame5();
            checkMainGameWin();
        }
    }

    public void checkGame6Win() {
        // if there is a win, codify current player into main matrix
        if (allEqual(game6[1][1], game6[1][2], game6[1][3]) || allEqual(game6[2][1], game6[2][2], game6[2][3]) || allEqual(game6[3][1], game6[3][2], game6[3][3]) || allEqual(game6[1][1], game6[2][2], game6[3][3]) || allEqual(game6[1][3], game6[2][2], game6[3][1]) || allEqual(game6[1][1], game6[2][1], game6[3][1]) || allEqual(game6[1][2], game6[2][2], game6[3][2]) || allEqual(game6[1][3], game6[2][3], game6[3][3])) {
            mainGame[2][3] = currentPlayer;
            // if cursor points to this board, allow all movement
            if (currentGame == 6) currentGame = 0;
            disableGame6();
            checkMainGameWin();
        }
    }

    public void checkGame7Win() {
        // if there is a win, codify current player into main matrix
        if (allEqual(game7[1][1], game7[1][2], game7[1][3]) || allEqual(game7[2][1], game7[2][2], game7[2][3]) || allEqual(game7[3][1], game7[3][2], game7[3][3]) || allEqual(game7[1][1], game7[2][2], game7[3][3]) || allEqual(game7[1][3], game7[2][2], game7[3][1]) || allEqual(game7[1][1], game7[2][1], game7[3][1]) || allEqual(game7[1][2], game7[2][2], game7[3][2]) || allEqual(game7[1][3], game7[2][3], game7[3][3])) {
            mainGame[3][1] = currentPlayer;
            // if cursor points to this board, allow all movement
            if (currentGame == 7) currentGame = 0;
            disableGame7();
            checkMainGameWin();
        }
    }

    public void checkGame8Win() {
        // if there is a win, codify current player into main matrix
        if (allEqual(game8[1][1], game8[1][2], game8[1][3]) || allEqual(game8[2][1], game8[2][2], game8[2][3]) || allEqual(game8[3][1], game8[3][2], game8[3][3]) || allEqual(game8[1][1], game8[2][2], game8[3][3]) || allEqual(game8[1][3], game8[2][2], game8[3][1]) || allEqual(game8[1][1], game8[2][1], game8[3][1]) || allEqual(game8[1][2], game8[2][2], game8[3][2]) || allEqual(game8[1][3], game8[2][3], game8[3][3])) {
            mainGame[3][2] = currentPlayer;
            // if cursor points to this board, allow all movement
            if (currentGame == 8) currentGame = 0;
            disableGame8();
            checkMainGameWin();
        }
    }

    public void checkGame9Win() {
        // if there is a win, codify current player into main matrix
        if (allEqual(game9[1][1], game9[1][2], game9[1][3]) || allEqual(game9[2][1], game9[2][2], game9[2][3]) || allEqual(game9[3][1], game9[3][2], game9[3][3]) || allEqual(game9[1][1], game9[2][2], game9[3][3]) || allEqual(game9[1][3], game9[2][2], game9[3][1]) || allEqual(game9[1][1], game9[2][1], game9[3][1]) || allEqual(game9[1][2], game9[2][2], game9[3][2]) || allEqual(game9[1][3], game9[2][3], game9[3][3])) {
            mainGame[3][3] = currentPlayer;
            // if cursor points to this board, allow all movement
            if (currentGame == 9) currentGame = 0;
            disableGame9();
            checkMainGameWin();
        }
    }

    //method to test overall board win
    public void checkMainGameWin() {
        //first check if game is actually won (forgot to do that first time I wrote this ^^)
        if (allEqual(mainGame[1][1], mainGame[1][2], mainGame[1][3]) || allEqual(mainGame[2][1], mainGame[2][2], mainGame[2][3]) || allEqual(mainGame[3][1], mainGame[3][2], mainGame[3][3]) || allEqual(mainGame[1][1], mainGame[2][2], mainGame[3][3]) || allEqual(mainGame[1][3], mainGame[2][2], mainGame[3][1]) || allEqual(mainGame[1][1], mainGame[2][1], mainGame[3][1]) || allEqual(mainGame[1][2], mainGame[2][2], mainGame[3][2]) || allEqual(mainGame[1][3], mainGame[2][3], mainGame[3][3])) {
            // disable all boards
            disableAllBoards();


            // highlight winning board
            if (allEqual(mainGame[1][1], mainGame[1][2], mainGame[1][3])) {
                button11.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button12.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button13.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button14.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button15.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button16.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button17.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button18.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button19.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button21.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button22.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button23.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button24.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button25.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button26.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button27.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button28.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button29.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button31.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button32.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button33.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button34.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button35.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button36.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button37.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button38.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button39.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
            }
            if (allEqual(mainGame[2][1], mainGame[2][2], mainGame[2][3])) {
                button41.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button42.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button43.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button44.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button45.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button46.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button47.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button48.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button49.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button51.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button52.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button53.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button54.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button55.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button56.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button57.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button58.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button59.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button61.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button62.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button63.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button64.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button65.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button66.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button67.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button68.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button69.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
            }
            if (allEqual(mainGame[3][1], mainGame[3][2], mainGame[3][3])) {
                button71.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button72.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button73.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button74.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button75.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button76.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button77.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button78.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button79.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button81.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button82.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button83.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button84.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button85.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button86.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button87.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button88.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button89.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button91.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button92.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button93.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button94.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button95.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button96.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button97.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button98.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button99.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
            }
            if (allEqual(mainGame[1][1], mainGame[2][2], mainGame[3][3])) {
                button11.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button12.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button13.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button21.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button22.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button23.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button31.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button32.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button33.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button44.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button45.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button46.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button54.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button55.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button56.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button64.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button65.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button66.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button77.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button78.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button79.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button87.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button88.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button89.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button97.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button98.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button99.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
            }
            if (allEqual(mainGame[1][3], mainGame[2][2], mainGame[3][1])) {
                button17.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button18.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button19.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button27.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button28.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button29.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button37.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button38.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button39.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button44.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button45.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button46.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button54.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button55.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button56.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button64.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button65.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button66.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button71.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button72.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button73.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button81.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button82.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button83.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button91.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button92.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button93.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
            }
            if (allEqual(mainGame[1][1], mainGame[2][1], mainGame[3][1])) {
                button11.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button12.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button13.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button21.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button22.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button23.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button31.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button32.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button33.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button41.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button42.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button43.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button51.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button52.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button53.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button61.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button62.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button63.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button71.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button72.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button73.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button81.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button82.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button83.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button91.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button92.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button93.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
            }
            if (allEqual(mainGame[1][2], mainGame[2][2], mainGame[3][2])) {
                button14.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button15.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button16.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button24.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button25.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button26.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button34.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button35.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button36.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button44.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button45.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button46.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button54.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button55.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button56.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button64.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button65.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button66.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button74.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button75.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button76.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button84.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button85.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button86.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button94.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button95.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button96.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
            }
            if (allEqual(mainGame[1][3], mainGame[2][3], mainGame[3][3])) {
                button17.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button18.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button19.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button27.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button28.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button29.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button37.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button38.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button39.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button47.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button48.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button49.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button57.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button58.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button59.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button67.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button68.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button69.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button77.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button78.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button79.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button87.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button88.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button89.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button97.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button98.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
                button99.getBackground().setColorFilter(new LightingColorFilter(0xff4CAF50, 0x000000));
            }
        }
    }

    //method to disable all boards
    private void disableAllBoards() {
        disableGame1();
        disableGame2();
        disableGame3();
        disableGame4();
        disableGame5();
        disableGame6();
        disableGame7();
        disableGame8();
        disableGame9();
    }

    //methods for disabling (and highlighting) won boards
    public void disableGame1() {
        //disable all buttons on this board
        button11.setEnabled(false);
        button12.setEnabled(false);
        button13.setEnabled(false);
        button21.setEnabled(false);
        button22.setEnabled(false);
        button23.setEnabled(false);
        button31.setEnabled(false);
        button32.setEnabled(false);
        button33.setEnabled(false);

        //reset highlighting for this board
        resetGame1();

        //set highlighting to winning line
        if (allEqual(game1[1][1], game1[1][2], game1[1][3])) {
            button11.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
            button12.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
            button13.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
        }
        if (allEqual(game1[2][1], game1[2][2], game1[2][3])) {
            button21.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
            button22.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
            button23.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
        }
        if (allEqual(game1[3][1], game1[3][2], game1[3][3])) {
            button31.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
            button32.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
            button33.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
        }
        if (allEqual(game1[1][1], game1[2][2], game1[3][3])) {
            button11.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
            button22.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
            button33.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
        }
        if (allEqual(game1[1][3], game1[2][2], game1[3][1])) {
            button13.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
            button22.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
            button31.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
        }
        if (allEqual(game1[1][1], game1[2][1], game1[3][1])) {
            button11.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
            button21.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
            button31.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
        }
        if (allEqual(game1[1][2], game1[2][2], game1[3][2])) {
            button12.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
            button22.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
            button32.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
        }
        if (allEqual(game1[1][3], game1[2][3], game1[3][3])) {
            button13.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
            button23.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
            button33.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
        }
    }

    public void disableGame2() {
        //disable all buttons on this board
        button14.setEnabled(false);
        button15.setEnabled(false);
        button16.setEnabled(false);
        button24.setEnabled(false);
        button25.setEnabled(false);
        button26.setEnabled(false);
        button34.setEnabled(false);
        button35.setEnabled(false);
        button36.setEnabled(false);

        //reset highlighting for this board
        resetGame2();

        //set highlighting to winning line
        if (allEqual(game2[1][1], game2[1][2], game2[1][3])) {
            button14.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
            button15.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
            button16.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
        }
        if (allEqual(game2[2][1], game2[2][2], game2[2][3])) {
            button24.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
            button25.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
            button26.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
        }
        if (allEqual(game2[3][1], game2[3][2], game2[3][3])) {
            button34.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
            button35.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
            button36.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
        }
        if (allEqual(game2[1][1], game2[2][2], game2[3][3])) {
            button14.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
            button25.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
            button36.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
        }
        if (allEqual(game2[1][3], game2[2][2], game2[3][1])) {
            button16.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
            button25.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
            button34.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
        }
        if (allEqual(game2[1][1], game2[2][1], game2[3][1])) {
            button14.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
            button24.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
            button34.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
        }
        if (allEqual(game2[1][2], game2[2][2], game2[3][2])) {
            button15.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
            button25.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
            button35.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
        }
        if (allEqual(game2[1][3], game2[2][3], game2[3][3])) {
            button16.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
            button26.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
            button36.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
        }
    }

    public void disableGame3() {
        //disable all buttons on this board
        button17.setEnabled(false);
        button18.setEnabled(false);
        button19.setEnabled(false);
        button27.setEnabled(false);
        button28.setEnabled(false);
        button29.setEnabled(false);
        button37.setEnabled(false);
        button38.setEnabled(false);
        button39.setEnabled(false);

        //reset highlighting for this board
        resetGame3();

        //set highlighting to winning line
        if (allEqual(game3[1][1], game3[1][2], game3[1][3])) {
            button17.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
            button18.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
            button19.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
        }
        if (allEqual(game3[2][1], game3[2][2], game3[2][3])) {
            button27.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
            button28.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
            button29.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
        }
        if (allEqual(game3[3][1], game3[3][2], game3[3][3])) {
            button37.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
            button38.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
            button39.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
        }
        if (allEqual(game3[1][1], game3[2][2], game3[3][3])) {
            button17.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
            button28.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
            button39.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
        }
        if (allEqual(game3[1][3], game3[2][2], game3[3][1])) {
            button28.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
            button19.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
            button37.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
        }
        if (allEqual(game3[1][1], game3[2][1], game3[3][1])) {
            button17.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
            button27.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
            button37.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
        }
        if (allEqual(game3[1][2], game3[2][2], game3[3][2])) {
            button18.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
            button28.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
            button38.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
        }
        if (allEqual(game3[1][3], game3[2][3], game3[3][3])) {
            button19.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
            button29.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
            button39.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
        }
    }

    public void disableGame4() {
        //disable all buttons on this board
        button41.setEnabled(false);
        button42.setEnabled(false);
        button43.setEnabled(false);
        button51.setEnabled(false);
        button52.setEnabled(false);
        button53.setEnabled(false);
        button61.setEnabled(false);
        button62.setEnabled(false);
        button63.setEnabled(false);

        //reset highlighting for this board
        resetGame4();

        //set highlighting to winning line
        if (allEqual(game4[1][1], game4[1][2], game4[1][3])) {
            button41.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
            button42.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
            button43.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
        }
        if (allEqual(game4[2][1], game4[2][2], game4[2][3])) {
            button51.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
            button52.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
            button53.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
        }
        if (allEqual(game4[3][1], game4[3][2], game4[3][3])) {
            button61.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
            button62.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
            button63.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
        }
        if (allEqual(game4[1][1], game4[2][2], game4[3][3])) {
            button41.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
            button52.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
            button63.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
        }
        if (allEqual(game4[1][3], game4[2][2], game4[3][1])) {
            button52.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
            button43.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
            button61.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
        }
        if (allEqual(game4[1][1], game4[2][1], game4[3][1])) {
            button41.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
            button51.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
            button61.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
        }
        if (allEqual(game4[1][2], game4[2][2], game4[3][2])) {
            button42.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
            button52.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
            button62.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
        }
        if (allEqual(game4[1][3], game4[2][3], game4[3][3])) {
            button43.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
            button53.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
            button63.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
        }
    }

    public void disableGame5() {
        //disable all buttons on this board
        button44.setEnabled(false);
        button45.setEnabled(false);
        button46.setEnabled(false);
        button54.setEnabled(false);
        button55.setEnabled(false);
        button56.setEnabled(false);
        button64.setEnabled(false);
        button65.setEnabled(false);
        button66.setEnabled(false);

        //reset highlighting for this board
        resetGame5();

        //set highlighting to winning line
        if (allEqual(game5[1][1], game5[1][2], game5[1][3])) {
            button44.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
            button45.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
            button46.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
        }
        if (allEqual(game5[2][1], game5[2][2], game5[2][3])) {
            button54.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
            button55.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
            button56.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
        }
        if (allEqual(game5[3][1], game5[3][2], game5[3][3])) {
            button64.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
            button65.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
            button66.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
        }
        if (allEqual(game5[1][1], game5[2][2], game5[3][3])) {
            button44.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
            button55.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
            button66.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
        }
        if (allEqual(game5[1][3], game5[2][2], game5[3][1])) {
            button55.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
            button46.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
            button64.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
        }
        if (allEqual(game5[1][1], game5[2][1], game5[3][1])) {
            button44.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
            button54.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
            button64.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
        }
        if (allEqual(game5[1][2], game5[2][2], game5[3][2])) {
            button45.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
            button55.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
            button65.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
        }
        if (allEqual(game5[1][3], game5[2][3], game5[3][3])) {
            button46.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
            button56.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
            button66.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
        }
    }

    public void disableGame6() {
        //disable all buttons on this board
        button47.setEnabled(false);
        button48.setEnabled(false);
        button49.setEnabled(false);
        button57.setEnabled(false);
        button58.setEnabled(false);
        button59.setEnabled(false);
        button67.setEnabled(false);
        button68.setEnabled(false);
        button69.setEnabled(false);

        //reset highlighting for this board
        resetGame6();

        //set highlighting to winning line
        if (allEqual(game6[1][1], game6[1][2], game6[1][3])) {
            button47.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
            button48.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
            button49.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
        }
        if (allEqual(game6[2][1], game6[2][2], game6[2][3])) {
            button57.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
            button58.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
            button59.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
        }
        if (allEqual(game6[3][1], game6[3][2], game6[3][3])) {
            button67.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
            button68.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
            button69.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
        }
        if (allEqual(game6[1][1], game6[2][2], game6[3][3])) {
            button47.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
            button58.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
            button69.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
        }
        if (allEqual(game6[1][3], game6[2][2], game6[3][1])) {
            button58.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
            button49.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
            button67.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
        }
        if (allEqual(game6[1][1], game6[2][1], game6[3][1])) {
            button47.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
            button57.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
            button67.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
        }
        if (allEqual(game6[1][2], game6[2][2], game6[3][2])) {
            button48.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
            button58.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
            button68.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
        }
        if (allEqual(game6[1][3], game6[2][3], game6[3][3])) {
            button49.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
            button59.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
            button69.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
        }
    }

    public void disableGame7() {
        //disable all buttons on this board
        button71.setEnabled(false);
        button72.setEnabled(false);
        button73.setEnabled(false);
        button81.setEnabled(false);
        button82.setEnabled(false);
        button83.setEnabled(false);
        button91.setEnabled(false);
        button92.setEnabled(false);
        button93.setEnabled(false);

        //reset highlighting for this board
        resetGame7();

        //set highlighting to winning line
        if (allEqual(game7[1][1], game7[1][2], game7[1][3])) {
            button71.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
            button72.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
            button73.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
        }
        if (allEqual(game7[2][1], game7[2][2], game7[2][3])) {
            button81.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
            button82.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
            button83.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
        }
        if (allEqual(game7[3][1], game7[3][2], game7[3][3])) {
            button91.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
            button92.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
            button93.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
        }
        if (allEqual(game7[1][1], game7[2][2], game7[3][3])) {
            button71.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
            button82.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
            button93.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
        }
        if (allEqual(game7[1][3], game7[2][2], game7[3][1])) {
            button82.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
            button73.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
            button91.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
        }
        if (allEqual(game7[1][1], game7[2][1], game7[3][1])) {
            button71.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
            button81.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
            button91.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
        }
        if (allEqual(game7[1][2], game7[2][2], game7[3][2])) {
            button72.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
            button82.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
            button92.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
        }
        if (allEqual(game7[1][3], game7[2][3], game7[3][3])) {
            button73.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
            button83.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
            button93.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
        }
    }

    public void disableGame8() {
        //disable all buttons on this board
        button74.setEnabled(false);
        button75.setEnabled(false);
        button76.setEnabled(false);
        button84.setEnabled(false);
        button85.setEnabled(false);
        button86.setEnabled(false);
        button94.setEnabled(false);
        button95.setEnabled(false);
        button96.setEnabled(false);

        //reset highlighting for this board
        resetGame8();

        //set highlighting to winning line
        if (allEqual(game8[1][1], game8[1][2], game8[1][3])) {
            button74.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
            button75.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
            button76.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
        }
        if (allEqual(game8[2][1], game8[2][2], game8[2][3])) {
            button84.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
            button85.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
            button86.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
        }
        if (allEqual(game8[3][1], game8[3][2], game8[3][3])) {
            button94.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
            button95.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
            button96.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
        }
        if (allEqual(game8[1][1], game8[2][2], game8[3][3])) {
            button74.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
            button85.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
            button96.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
        }
        if (allEqual(game8[1][3], game8[2][2], game8[3][1])) {
            button85.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
            button76.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
            button94.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
        }
        if (allEqual(game8[1][1], game8[2][1], game8[3][1])) {
            button74.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
            button84.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
            button94.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
        }
        if (allEqual(game8[1][2], game8[2][2], game8[3][2])) {
            button75.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
            button85.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
            button95.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
        }
        if (allEqual(game8[1][3], game8[2][3], game8[3][3])) {
            button76.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
            button86.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
            button96.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
        }
    }

    public void disableGame9() {
        //disable all buttons on this board
        button77.setEnabled(false);
        button78.setEnabled(false);
        button79.setEnabled(false);
        button87.setEnabled(false);
        button88.setEnabled(false);
        button89.setEnabled(false);
        button97.setEnabled(false);
        button98.setEnabled(false);
        button99.setEnabled(false);

        //reset highlighting for this board
        resetGame9();

        //set highlighting to winning line
        if (allEqual(game9[1][1], game9[1][2], game9[1][3])) {
            button77.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
            button78.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
            button79.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
        }
        if (allEqual(game9[2][1], game9[2][2], game9[2][3])) {
            button87.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
            button88.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
            button89.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
        }
        if (allEqual(game9[3][1], game9[3][2], game9[3][3])) {
            button97.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
            button98.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
            button99.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
        }
        if (allEqual(game9[1][1], game9[2][2], game9[3][3])) {
            button77.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
            button88.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
            button99.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
        }
        if (allEqual(game9[1][3], game9[2][2], game9[3][1])) {
            button88.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
            button79.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
            button97.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
        }
        if (allEqual(game9[1][1], game9[2][1], game9[3][1])) {
            button77.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
            button87.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
            button97.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
        }
        if (allEqual(game9[1][2], game9[2][2], game9[3][2])) {
            button78.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
            button88.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
            button98.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
        }
        if (allEqual(game9[1][3], game9[2][3], game9[3][3])) {
            button79.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
            button89.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
            button99.getBackground().setColorFilter(new LightingColorFilter(0xffC5E1A5, 0x000000));
        }
    }

    // todo set winningText to display instructions/win

    //methods to set active game
    public void activeGame1() {
        //reset highlighting for all boards not won
        resetHighlighting();

        //test for already won board and allow movement outside current board
        if (mainGame[1][1] != 0) {
            currentGame = 0;
        } else {
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
    }

    public void activeGame2() {
        //reset highlighting for all boards not won
        resetHighlighting();

        //test for already won board and allow movement outside current board
        if (mainGame[1][2] != 0) {
            currentGame = 0;
        } else {
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
    }

    public void activeGame3() {
        //reset highlighting for all boards not won
        resetHighlighting();

        //test for already won board and allow movement outside current board
        if (mainGame[1][3] != 0) {
            currentGame = 0;
        } else {
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
    }

    public void activeGame4() {
        //reset highlighting for all boards not won
        resetHighlighting();

        //test for already won board and allow movement outside current board
        if (mainGame[2][1] != 0) {
            currentGame = 0;
        } else {
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
    }

    public void activeGame5() {
        //reset highlighting for all boards not won
        resetHighlighting();

        //test for already won board and allow movement outside current board
        if (mainGame[2][2] != 0) {
            currentGame = 0;
        } else {
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
    }

    public void activeGame6() {
        //reset highlighting for all boards not won
        resetHighlighting();

        //test for already won board and allow movement outside current board
        if (mainGame[2][3] != 0) {
            currentGame = 0;
        } else {
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
    }

    public void activeGame7() {
        //reset highlighting for all boards not won
        resetHighlighting();

        //test for already won board and allow movement outside current board
        if (mainGame[3][1] != 0) {
            currentGame = 0;
        } else {
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
    }

    public void activeGame8() {
        //reset highlighting for all boards not won
        resetHighlighting();

        //test for already won board and allow movement outside current board
        if (mainGame[3][2] != 0) {
            currentGame = 0;
        } else {
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
    }

    public void activeGame9() {
        //reset highlighting for all boards not won
        resetHighlighting();

        //test for already won board and allow movement outside current board
        if (mainGame[3][3] != 0) {
            currentGame = 0;
        } else {
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

    //logic to determine which boards get reset (i.e. all that do not have final scores)
    public void resetHighlighting() {
        if (mainGame[1][1] == 0) resetGame1();
        if (mainGame[1][2] == 0) resetGame2();
        if (mainGame[1][3] == 0) resetGame3();
        if (mainGame[2][1] == 0) resetGame4();
        if (mainGame[2][2] == 0) resetGame5();
        if (mainGame[2][3] == 0) resetGame6();
        if (mainGame[3][1] == 0) resetGame7();
        if (mainGame[3][2] == 0) resetGame8();
        if (mainGame[3][3] == 0) resetGame9();
    }

    //methods to reset each individual game, for more control
    public void resetGame1() {
        button11.getBackground().setColorFilter(null);
        button12.getBackground().setColorFilter(null);
        button13.getBackground().setColorFilter(null);
        button21.getBackground().setColorFilter(null);
        button22.getBackground().setColorFilter(null);
        button23.getBackground().setColorFilter(null);
        button31.getBackground().setColorFilter(null);
        button32.getBackground().setColorFilter(null);
        button33.getBackground().setColorFilter(null);
    }

    public void resetGame2() {
        button14.getBackground().setColorFilter(null);
        button15.getBackground().setColorFilter(null);
        button16.getBackground().setColorFilter(null);
        button24.getBackground().setColorFilter(null);
        button25.getBackground().setColorFilter(null);
        button26.getBackground().setColorFilter(null);
        button34.getBackground().setColorFilter(null);
        button35.getBackground().setColorFilter(null);
        button36.getBackground().setColorFilter(null);
    }

    public void resetGame3() {
        button17.getBackground().setColorFilter(null);
        button18.getBackground().setColorFilter(null);
        button19.getBackground().setColorFilter(null);
        button27.getBackground().setColorFilter(null);
        button28.getBackground().setColorFilter(null);
        button29.getBackground().setColorFilter(null);
        button37.getBackground().setColorFilter(null);
        button38.getBackground().setColorFilter(null);
        button39.getBackground().setColorFilter(null);
    }

    public void resetGame4() {
        button41.getBackground().setColorFilter(null);
        button42.getBackground().setColorFilter(null);
        button43.getBackground().setColorFilter(null);
        button51.getBackground().setColorFilter(null);
        button52.getBackground().setColorFilter(null);
        button53.getBackground().setColorFilter(null);
        button61.getBackground().setColorFilter(null);
        button62.getBackground().setColorFilter(null);
        button63.getBackground().setColorFilter(null);
    }

    public void resetGame5() {
        button44.getBackground().setColorFilter(null);
        button45.getBackground().setColorFilter(null);
        button46.getBackground().setColorFilter(null);
        button54.getBackground().setColorFilter(null);
        button55.getBackground().setColorFilter(null);
        button56.getBackground().setColorFilter(null);
        button64.getBackground().setColorFilter(null);
        button65.getBackground().setColorFilter(null);
        button66.getBackground().setColorFilter(null);
    }

    public void resetGame6() {
        button47.getBackground().setColorFilter(null);
        button48.getBackground().setColorFilter(null);
        button49.getBackground().setColorFilter(null);
        button57.getBackground().setColorFilter(null);
        button58.getBackground().setColorFilter(null);
        button59.getBackground().setColorFilter(null);
        button67.getBackground().setColorFilter(null);
        button68.getBackground().setColorFilter(null);
        button69.getBackground().setColorFilter(null);
    }

    public void resetGame7() {
        button71.getBackground().setColorFilter(null);
        button72.getBackground().setColorFilter(null);
        button73.getBackground().setColorFilter(null);
        button81.getBackground().setColorFilter(null);
        button82.getBackground().setColorFilter(null);
        button83.getBackground().setColorFilter(null);
        button91.getBackground().setColorFilter(null);
        button92.getBackground().setColorFilter(null);
        button93.getBackground().setColorFilter(null);
    }

    public void resetGame8() {
        button74.getBackground().setColorFilter(null);
        button75.getBackground().setColorFilter(null);
        button76.getBackground().setColorFilter(null);
        button84.getBackground().setColorFilter(null);
        button85.getBackground().setColorFilter(null);
        button86.getBackground().setColorFilter(null);
        button94.getBackground().setColorFilter(null);
        button95.getBackground().setColorFilter(null);
        button96.getBackground().setColorFilter(null);
    }

    public void resetGame9() {
        button77.getBackground().setColorFilter(null);
        button78.getBackground().setColorFilter(null);
        button79.getBackground().setColorFilter(null);
        button87.getBackground().setColorFilter(null);
        button88.getBackground().setColorFilter(null);
        button89.getBackground().setColorFilter(null);
        button97.getBackground().setColorFilter(null);
        button98.getBackground().setColorFilter(null);
        button99.getBackground().setColorFilter(null);
    }

    public void reset(View view) {
        //todo check reset functionality

        //reset variables
        game1 = new int[4][4];
        game2 = new int[4][4];
        game3 = new int[4][4];
        game4 = new int[4][4];
        game5 = new int[4][4];
        game6 = new int[4][4];
        game7 = new int[4][4];
        game8 = new int[4][4];
        game9 = new int[4][4];
        mainGame = new int[4][4];
        currentPlayer = 1;
        currentGame = 0;

        // reset all highlighting
        resetAllButtons();

        // re-enable all buttons
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

        //clear all text from buttons
        button11.setText("");
        button12.setText("");
        button13.setText("");
        button14.setText("");
        button15.setText("");
        button16.setText("");
        button17.setText("");
        button18.setText("");
        button19.setText("");
        button21.setText("");
        button22.setText("");
        button23.setText("");
        button24.setText("");
        button25.setText("");
        button26.setText("");
        button27.setText("");
        button28.setText("");
        button29.setText("");
        button31.setText("");
        button32.setText("");
        button33.setText("");
        button34.setText("");
        button35.setText("");
        button36.setText("");
        button37.setText("");
        button38.setText("");
        button39.setText("");
        button41.setText("");
        button42.setText("");
        button43.setText("");
        button44.setText("");
        button45.setText("");
        button46.setText("");
        button47.setText("");
        button48.setText("");
        button49.setText("");
        button51.setText("");
        button52.setText("");
        button53.setText("");
        button54.setText("");
        button55.setText("");
        button56.setText("");
        button57.setText("");
        button58.setText("");
        button59.setText("");
        button61.setText("");
        button62.setText("");
        button63.setText("");
        button64.setText("");
        button65.setText("");
        button66.setText("");
        button67.setText("");
        button68.setText("");
        button69.setText("");
        button71.setText("");
        button72.setText("");
        button73.setText("");
        button74.setText("");
        button75.setText("");
        button76.setText("");
        button77.setText("");
        button78.setText("");
        button79.setText("");
        button81.setText("");
        button82.setText("");
        button83.setText("");
        button84.setText("");
        button85.setText("");
        button86.setText("");
        button87.setText("");
        button88.setText("");
        button89.setText("");
        button91.setText("");
        button92.setText("");
        button93.setText("");
        button94.setText("");
        button95.setText("");
        button96.setText("");
        button97.setText("");
        button98.setText("");
        button99.setText("");

    }

    //method to remove highlighting on all buttons by setting a null color filters
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

}