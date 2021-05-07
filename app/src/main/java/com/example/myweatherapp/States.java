package com.example.myweatherapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;

public class States extends AppCompatActivity {
    private FirebaseFirestore Firestore;

    private ImageButton getAR;
    private ImageButton getAL;
    private ImageButton getGA;
    private ImageButton getFL;
    private ImageButton getLA;
    private ImageButton getMS;
    private ImageButton getNC;
    private ImageButton getSC;
    private ImageButton getTN;

    private TextView Output;
    private Switch units;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_states);

        Firestore = FirebaseFirestore.getInstance();

        getAR = (ImageButton) findViewById(R.id.ARbutton);
        getAL = (ImageButton) findViewById(R.id.ALbutton);
        getGA = (ImageButton) findViewById(R.id.GAbutton);
        getFL = (ImageButton) findViewById(R.id.FLbutton);
        getLA = (ImageButton) findViewById(R.id.LAbutton);
        getMS = (ImageButton) findViewById(R.id.MSbutton);
        getNC = (ImageButton) findViewById(R.id.NCbutton);
        getSC = (ImageButton) findViewById(R.id.SCbutton);
        getTN = (ImageButton) findViewById(R.id.TNbutton);

        Output = (TextView) findViewById(R.id.temperatureOutput);

        units = (Switch) findViewById(R.id.switcher);
        units.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
            }
        });
        
        getAR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(units.isChecked()==true)
                {
                    Firestore.collection("city").document("city_name_c").get().addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
                        @Override
                        public void onComplete(@NonNull Task<DocumentSnapshot> task) {
                            if(task.isSuccessful()){
                                DocumentSnapshot documentSnapshot = task.getResult();
                                String temperature = documentSnapshot.getString("Arkansas");
                                Output.setText(temperature);
                            }
                        }
                    });
                }
                else
                {
                    Firestore.collection("city").document("city_name_f").get().addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
                        @Override
                        public void onComplete(@NonNull Task<DocumentSnapshot> task) {
                            if(task.isSuccessful()){
                                DocumentSnapshot documentSnapshot = task.getResult();
                                String temperature = documentSnapshot.getString("Arkansas");
                                Output.setText(temperature);
                            }
                        }
                    });
                }
            }
        });

        getAL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(units.isChecked()==true)
                {
                    Firestore.collection("city").document("city_name_c").get().addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
                        @Override
                        public void onComplete(@NonNull Task<DocumentSnapshot> task) {
                            if(task.isSuccessful()){
                                DocumentSnapshot documentSnapshot = task.getResult();
                                String temperature = documentSnapshot.getString("Alabama");
                                Output.setText(temperature);
                            }
                        }
                    });
                }
                else
                {
                    Firestore.collection("city").document("city_name_f").get().addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
                        @Override
                        public void onComplete(@NonNull Task<DocumentSnapshot> task) {
                            if(task.isSuccessful()){
                                DocumentSnapshot documentSnapshot = task.getResult();
                                String temperature = documentSnapshot.getString("Alabama");
                                Output.setText(temperature);
                            }
                        }
                    });
                }
            }
        });

        getFL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(units.isChecked()==true)
                {
                    Firestore.collection("city").document("city_name_c").get().addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
                        @Override
                        public void onComplete(@NonNull Task<DocumentSnapshot> task) {
                            if(task.isSuccessful()){
                                DocumentSnapshot documentSnapshot = task.getResult();
                                String temperature = documentSnapshot.getString("Florida");
                                Output.setText(temperature);
                            }
                        }
                    });
                }
                else
                {
                    Firestore.collection("city").document("city_name_f").get().addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
                        @Override
                        public void onComplete(@NonNull Task<DocumentSnapshot> task) {
                            if(task.isSuccessful()){
                                DocumentSnapshot documentSnapshot = task.getResult();
                                String temperature = documentSnapshot.getString("Florida");
                                Output.setText(temperature);
                            }
                        }
                    });
                }
            }
        });

        getGA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(units.isChecked()==true)
                {
                    Firestore.collection("city").document("city_name_c").get().addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
                        @Override
                        public void onComplete(@NonNull Task<DocumentSnapshot> task) {
                            if(task.isSuccessful()){
                                DocumentSnapshot documentSnapshot = task.getResult();
                                String temperature = documentSnapshot.getString("Georgia");
                                Output.setText(temperature);
                            }
                        }
                    });
                }
                else
                {
                    Firestore.collection("city").document("city_name_f").get().addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
                        @Override
                        public void onComplete(@NonNull Task<DocumentSnapshot> task) {
                            if(task.isSuccessful()){
                                DocumentSnapshot documentSnapshot = task.getResult();
                                String temperature = documentSnapshot.getString("Georgia");
                                Output.setText(temperature);
                            }
                        }
                    });
                }
            }
        });

        getLA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(units.isChecked()==true)
                {
                    Firestore.collection("city").document("city_name_c").get().addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
                        @Override
                        public void onComplete(@NonNull Task<DocumentSnapshot> task) {
                            if(task.isSuccessful()){
                                DocumentSnapshot documentSnapshot = task.getResult();
                                String temperature = documentSnapshot.getString("Louisiana");
                                Output.setText(temperature);
                            }
                        }
                    });
                }
                else
                {
                    Firestore.collection("city").document("city_name_f").get().addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
                        @Override
                        public void onComplete(@NonNull Task<DocumentSnapshot> task) {
                            if(task.isSuccessful()){
                                DocumentSnapshot documentSnapshot = task.getResult();
                                String temperature = documentSnapshot.getString("Louisiana");
                                Output.setText(temperature);
                            }
                        }
                    });
                }
            }
        });

        getMS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(units.isChecked()==true)
                {
                    Firestore.collection("city").document("city_name_c").get().addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
                        @Override
                        public void onComplete(@NonNull Task<DocumentSnapshot> task) {
                            if(task.isSuccessful()){
                                DocumentSnapshot documentSnapshot = task.getResult();
                                String temperature = documentSnapshot.getString("Mississippi");
                                Output.setText(temperature);
                            }
                        }
                    });
                }
                else
                {
                    Firestore.collection("city").document("city_name_f").get().addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
                        @Override
                        public void onComplete(@NonNull Task<DocumentSnapshot> task) {
                            if(task.isSuccessful()){
                                DocumentSnapshot documentSnapshot = task.getResult();
                                String temperature = documentSnapshot.getString("Mississippi");
                                Output.setText(temperature);
                            }
                        }
                    });
                }
            }
        });

        getTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(units.isChecked()==true)
                {
                    Firestore.collection("city").document("city_name_c").get().addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
                        @Override
                        public void onComplete(@NonNull Task<DocumentSnapshot> task) {
                            if(task.isSuccessful()){
                                DocumentSnapshot documentSnapshot = task.getResult();
                                String temperature = documentSnapshot.getString("Tennessee");
                                Output.setText(temperature);
                            }
                        }
                    });
                }
                else
                {
                    Firestore.collection("city").document("city_name_f").get().addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
                        @Override
                        public void onComplete(@NonNull Task<DocumentSnapshot> task) {
                            if(task.isSuccessful()){
                                DocumentSnapshot documentSnapshot = task.getResult();
                                String temperature = documentSnapshot.getString("Tennessee");
                                Output.setText(temperature);
                            }
                        }
                    });
                }
            }
        });

        getNC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(units.isChecked()==true)
                {
                    Firestore.collection("city").document("city_name_c").get().addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
                        @Override
                        public void onComplete(@NonNull Task<DocumentSnapshot> task) {
                            if(task.isSuccessful()){
                                DocumentSnapshot documentSnapshot = task.getResult();
                                String temperature = documentSnapshot.getString("Northcarolina");
                                Output.setText(temperature);
                            }
                        }
                    });
                }
                else
                {
                    Firestore.collection("city").document("city_name_f").get().addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
                        @Override
                        public void onComplete(@NonNull Task<DocumentSnapshot> task) {
                            if(task.isSuccessful()){
                                DocumentSnapshot documentSnapshot = task.getResult();
                                String temperature = documentSnapshot.getString("Northcarolina");
                                Output.setText(temperature);
                            }
                        }
                    });
                }
            }
        });

        getSC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(units.isChecked()==true)
                {
                    Firestore.collection("city").document("city_name_c").get().addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
                        @Override
                        public void onComplete(@NonNull Task<DocumentSnapshot> task) {
                            if(task.isSuccessful()){
                                DocumentSnapshot documentSnapshot = task.getResult();
                                String temperature = documentSnapshot.getString("Southcarolina");
                                Output.setText(temperature);
                            }
                        }
                    });
                }
                else
                {
                    Firestore.collection("city").document("city_name_f").get().addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
                        @Override
                        public void onComplete(@NonNull Task<DocumentSnapshot> task) {
                            if(task.isSuccessful()){
                                DocumentSnapshot documentSnapshot = task.getResult();
                                String temperature = documentSnapshot.getString("Southcarolina");
                                Output.setText(temperature);
                            }
                        }
                    });
                }
            }
        });

    }
}