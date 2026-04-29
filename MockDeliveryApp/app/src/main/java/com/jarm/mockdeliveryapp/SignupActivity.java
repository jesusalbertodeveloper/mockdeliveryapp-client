package com.jarm.mockdeliveryapp;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class SignupActivity extends AppCompatActivity {
    String name;
    String surname;
    String address;
    String addresscomments;
    String emailAddress;
    String phoneNumber;
    int sessionId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
      //  setContentView(R.layout.signup_first_screen);
        //try {
          //  Thread.sleep(50000);
        //} catch (InterruptedException e) {
          //  throw new RuntimeException(e);
        //}
        //setContentView(R.layout.signup_second_screen);
        //try {
          //  Thread.sleep(50000);
        //} catch (InterruptedException e) {
          //  throw new RuntimeException(e);
        //}
        setContentView(R.layout.signup_first_screen);
        Button nextinfirstscreen = findViewById(R.id.button15);
        nextinfirstscreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setContentView(R.layout.signup_second_screen);
                Button nextinsecondscreen = findViewById(R.id.button1580);
                nextinsecondscreen.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        setContentView(R.layout.signup_third_screen);
                        EditText namefield = findViewById(R.id.namefield);
                        EditText surnamefield = findViewById(R.id.surnamefield);
                        EditText addressfield = findViewById(R.id.addressfield);
                        EditText addresscommentsfield = findViewById(R.id.addresscommentsfield);
                        EditText emailaddressfield = findViewById(R.id.emailaddressfield);
                        EditText phonenumberfield = findViewById(R.id.phonenumberfield);
                        Button nextinthirdscreen = findViewById(R.id.button15801);
                        nextinthirdscreen.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                name = namefield.getText().toString();
                                surname = surnamefield.getText().toString();
                                address = addressfield.getText().toString();
                                addresscomments = addresscommentsfield.getText().toString();
                                emailAddress = emailaddressfield.getText().toString();
                                phoneNumber = phonenumberfield.getText().toString();
                                setContentView(R.layout.signup_password_setup_screen);
                            EditText passwordentryfield = findViewById(R.id.passwordentryfield);
                                EditText passwordconfirmationfield = findViewById(R.id.passwordentryfield);
                                String passwordentry = passwordentryfield.getText().toString();
                                String passwordconfirmation = passwordconfirmationfield.getText().toString();
Button buttonn = findViewById(R.id.button10999);
buttonn.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        if (passwordentry.equals(passwordconfirmation)) {
            setContentView(R.layout.signup_email_verification_screen);
            Retrofit retrofit = new Retrofit.Builder().baseUrl("http://192.168.122.174:3000").addConverterFactory(GsonConverterFactory.create()).build();
            UserRequest accountcreationsession = new UserRequest(name, surname, address, addresscomments, emailAddress, phoneNumber, passwordentry);
            AccountCreationSessionAPIService servicee = retrofit.create(AccountCreationSessionAPIService.class);
            Call<AccountCreationSessionAPIResponse> call = servicee.signup(accountcreationsession);
            call.enqueue(new Callback<AccountCreationSessionAPIResponse>() {
                @Override
                public void onResponse(Call<AccountCreationSessionAPIResponse> call, Response<AccountCreationSessionAPIResponse> response) {
                    if (response.isSuccessful() && response.body() != null) {
                        AccountCreationSessionAPIResponse result = response.body();
                        if (result.isSuccess()) {
                            Toast.makeText(SignupActivity.this, "New ID:" + Integer.toString(result.getToken()), Toast.LENGTH_SHORT).show();
                            sessionId = result.getToken();
                            setContentView(R.layout.signup_email_verification_screen);
                            EditText emailverificationcodefield = findViewById(R.id.emailverificationcodefield);
                            Button emailverificationnextbutton = findViewById(R.id.button10998);
                            emailverificationnextbutton.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    String emailverificationcode = emailverificationcodefield.getText().toString();
                                    Retrofit retrofit = new Retrofit.Builder().baseUrl("http://192.168.122.174:3000").addConverterFactory(GsonConverterFactory.create()).build();
                                    VerificationRequest accountcreationsession = new VerificationRequest(sessionId,Integer.parseInt(emailverificationcode));
                                    AccountCreationSessionAPIService servicee = retrofit.create(AccountCreationSessionAPIService.class);
                                    Call<AccountCreationSessionAPIVerificationResponse> call = servicee.verifyEmail(accountcreationsession);
                                    call.enqueue(new Callback<AccountCreationSessionAPIVerificationResponse>() {
                                        @Override
                                        public void onResponse(Call<AccountCreationSessionAPIVerificationResponse> call, Response<AccountCreationSessionAPIVerificationResponse> response) {
                                            if (response.isSuccessful() && response.body() != null) {
                                                AccountCreationSessionAPIVerificationResponse result = response.body();
                                                if (result.isSuccess()) {
                                                }
                                            } else {
                                                Toast.makeText(SignupActivity.this, "Error!", Toast.LENGTH_SHORT).show();
                                            }
                                        }

                                        @Override
                                        public void onFailure(Call<AccountCreationSessionAPIVerificationResponse> call, Throwable throwable) {
                                        }
                                    });
//});
                                }
                            });
                        } else {
                            Toast.makeText(SignupActivity.this, "Error!", Toast.LENGTH_SHORT).show();
                        }
                    }
                }
                @Override
                public void onFailure(Call<AccountCreationSessionAPIResponse> call, Throwable throwable) {
                }
            });
        }
    }
}

                                );
}
                        });
                        nextinthirdscreen.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                name = namefield.getText().toString();
                                surname = surnamefield.getText().toString();
                                address = addressfield.getText().toString();
                                addresscomments = addresscommentsfield.getText().toString();
                                emailAddress = emailaddressfield.getText().toString();
                                phoneNumber = phonenumberfield.getText().toString();
                                setContentView(R.layout.signup_password_setup_screen);
                                EditText passwordentryfield = findViewById(R.id.passwordentryfield);
                                EditText passwordconfirmationfield = findViewById(R.id.passwordentryfield);
                                String passwordentry = passwordentryfield.getText().toString();
                                String passwordconfirmation = passwordconfirmationfield.getText().toString();
                                Button buttonn = findViewById(R.id.button10999);
                                buttonn.setOnClickListener(new View.OnClickListener() {
                                                               @Override
                                                               public void onClick(View view) {
                                                                   if (passwordentry.equals(passwordconfirmation)) {
                                                                       setContentView(R.layout.signup_email_verification_screen);
                                                                       Retrofit retrofit = new Retrofit.Builder().baseUrl("http://192.168.122.174:3000").addConverterFactory(GsonConverterFactory.create()).build();
                                                                       UserRequest accountcreationsession = new UserRequest(name, surname, address, addresscomments, emailAddress, phoneNumber, passwordentry);
                                                                       AccountCreationSessionAPIService servicee = retrofit.create(AccountCreationSessionAPIService.class);
                                                                       Call<AccountCreationSessionAPIResponse> call = servicee.signup(accountcreationsession);
                                                                       call.enqueue(new Callback<AccountCreationSessionAPIResponse>() {
                                                                           @Override
                                                                           public void onResponse(Call<AccountCreationSessionAPIResponse> call, Response<AccountCreationSessionAPIResponse> response) {
                                                                               if (response.isSuccessful() && response.body() != null) {
                                                                                   AccountCreationSessionAPIResponse result = response.body();
                                                                                   if (result.isSuccess()) {
                                                                                       Toast.makeText(SignupActivity.this, "New ID:" + Integer.toString(result.getToken()), Toast.LENGTH_SHORT).show();
                                                                                       sessionId = result.getToken();
                                                                                       setContentView(R.layout.signup_email_verification_screen);
                                                                                       EditText emailverificationcodefield = findViewById(R.id.emailverificationcodefield);
                                                                                       Button emailverificationnextbutton = findViewById(R.id.button10998);
                                                                                       emailverificationnextbutton.setOnClickListener(new View.OnClickListener() {
                                                                                           @Override
                                                                                           public void onClick(View view) {
                                                                                               String emailverificationcode = emailverificationcodefield.getText().toString();
                                                                                               Retrofit retrofit = new Retrofit.Builder().baseUrl("http://192.168.122.174:3000").addConverterFactory(GsonConverterFactory.create()).build();
                                                                                               VerificationRequest accountcreationsession = new VerificationRequest(sessionId,Integer.parseInt(emailverificationcode));
                                                                                               AccountCreationSessionAPIService servicee = retrofit.create(AccountCreationSessionAPIService.class);
                                                                                               Call<AccountCreationSessionAPIVerificationResponse> call = servicee.verifyEmail(accountcreationsession);
                                                                                               call.enqueue(new Callback<AccountCreationSessionAPIVerificationResponse>() {
                                                                                                   @Override
                                                                                                   public void onFailure(Call<AccountCreationSessionAPIVerificationResponse> call, Throwable throwable) {
                                                                                                   }
                                                                                                   @Override
                                                                                                   public void onResponse(Call<AccountCreationSessionAPIVerificationResponse> call, Response<AccountCreationSessionAPIVerificationResponse> response) {
                                                                                                       if (response.isSuccessful() && response.body() != null) {
                                                                                                           AccountCreationSessionAPIVerificationResponse result = response.body();
                                                                                                           if (result.isSuccess()) {
                                                                                                               nextinthirdscreen.setOnClickListener(new View.OnClickListener() {
                                                                                                                   @Override
                                                                                                                   public void onClick(View view) {
                                                                                                                       name = namefield.getText().toString();
                                                                                                                       surname = surnamefield.getText().toString();
                                                                                                                       address = addressfield.getText().toString();
                                                                                                                       addresscomments = addresscommentsfield.getText().toString();
                                                                                                                       emailAddress = emailaddressfield.getText().toString();
                                                                                                                       phoneNumber = phonenumberfield.getText().toString();
                                                                                                                       setContentView(R.layout.signup_password_setup_screen);
                                                                                                                       EditText passwordentryfield = findViewById(R.id.passwordentryfield);
                                                                                                                       EditText passwordconfirmationfield = findViewById(R.id.passwordentryfield);
                                                                                                                       String passwordentry = passwordentryfield.getText().toString();
                                                                                                                       String passwordconfirmation = passwordconfirmationfield.getText().toString();
                                                                                                                       Button buttonn = findViewById(R.id.button10999);
                                                                                                                       buttonn.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                      @Override
                                                                                                                                                      public void onClick(View view) {
                                                                                                                                                          if (passwordentry.equals(passwordconfirmation)) {
                                                                                                                                                              setContentView(R.layout.signup_email_verification_screen);
                                                                                                                                                              Retrofit retrofit = new Retrofit.Builder().baseUrl("http://192.168.122.174:3000").addConverterFactory(GsonConverterFactory.create()).build();
                                                                                                                                                              UserRequest accountcreationsession = new UserRequest(name, surname, address, addresscomments, emailAddress, phoneNumber, passwordentry);
                                                                                                                                                              AccountCreationSessionAPIService servicee = retrofit.create(AccountCreationSessionAPIService.class);
                                                                                                                                                              Call<AccountCreationSessionAPIResponse> call = servicee.signup(accountcreationsession);
                                                                                                                                                              call.enqueue(new Callback<AccountCreationSessionAPIResponse>() {
                                                                                                                                                                  @Override
                                                                                                                                                                  public void onResponse(Call<AccountCreationSessionAPIResponse> call, Response<AccountCreationSessionAPIResponse> response) {
                                                                                                                                                                      if (response.isSuccessful() && response.body() != null) {
                                                                                                                                                                          AccountCreationSessionAPIResponse result = response.body();
                                                                                                                                                                          if (result.isSuccess()) {
                                                                                                                                                                              Toast.makeText(SignupActivity.this, "New ID:" + Integer.toString(result.getToken()), Toast.LENGTH_SHORT).show();
                                                                                                                                                                              sessionId = result.getToken();
                                                                                                                                                                              setContentView(R.layout.signup_email_verification_screen);
                                                                                                                                                                              EditText emailverificationcodefield = findViewById(R.id.emailverificationcodefield);
                                                                                                                                                                              Button emailverificationnextbutton = findViewById(R.id.button10998);
                                                                                                                                                                              emailverificationnextbutton.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                  @Override
                                                                                                                                                                                  public void onClick(View view) {
                                                                                                                                                                                      String emailverificationcode = emailverificationcodefield.getText().toString();
                                                                                                                                                                                      setContentView(R.layout.signup_phone_verification_by_sms_screen);
                                                                                                                                                                                      Retrofit retrofit = new Retrofit.Builder().baseUrl("http://192.168.122.174:3000").addConverterFactory(GsonConverterFactory.create()).build();
                                                                                                                                                                                      VerificationRequest accountcreationsession = new VerificationRequest(sessionId,Integer.parseInt(emailverificationcode));
                                                                                                                                                                                      AccountCreationSessionAPIService servicee = retrofit.create(AccountCreationSessionAPIService.class);
                                                                                                                                                                                      Call<AccountCreationSessionAPIVerificationResponse> call = servicee.verifyEmail(accountcreationsession);
                                                                                                                                                                                      call.enqueue(new Callback<AccountCreationSessionAPIVerificationResponse>() {
                                                                                                                                                                                          @Override
                                                                                                                                                                                          public void onFailure(Call<AccountCreationSessionAPIVerificationResponse> call, Throwable throwable) {
                                                                                                                                                                                          }
                                                                                                                                                                                          @Override
                                                                                                                                                                                          public void onResponse(Call<AccountCreationSessionAPIVerificationResponse> call, Response<AccountCreationSessionAPIVerificationResponse> response) {
                                                                                                                                                                                              if (response.isSuccessful() && response.body() != null) {
                                                                                                                                                                                                  AccountCreationSessionAPIVerificationResponse result = response.body();
                                                                                                                                                                                                  if (result.isSuccess()) {
                                                                                                                                                                                                  }
                                                                                                                                                                                              } else {
                                                                                                                                                                                                  Toast.makeText(SignupActivity.this, "Error!", Toast.LENGTH_SHORT).show();
                                                                                                                                                                                              }
                                                                                                                                                                                          }
                                                                                                                                                                                      });
                                                                                                                                                                                      EditText smsverificationcodefield = findViewById(R.id.smsverificationcodefield);
                                                                                                                                                                                      Button smsverificationnextbutton = findViewById(R.id.button10997);
                                                                                                                                                                                      smsverificationnextbutton.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                          @Override
                                                                                                                                                                                          public void onClick(View view) {
                                                                                                                                                                                              String smsverificationcode = smsverificationcodefield.getText().toString();
                                                                                                                                                                                              Retrofit retrofit1 = new Retrofit.Builder().baseUrl("http://192.168.122.174:3000").addConverterFactory(GsonConverterFactory.create()).build();
                                                                                                                                                                                              VerificationRequest accountcreationsession1 = new VerificationRequest(sessionId,Integer.parseInt(smsverificationcode));
                                                                                                                                                                                              AccountCreationSessionAPIService servicee = retrofit.create(AccountCreationSessionAPIService.class);
                                                                                                                                                                                              Call<AccountCreationSessionAPIVerificationResponse> call = servicee.verifyPhone(accountcreationsession1);
                                                                                                                                                                                              call.enqueue(new Callback<AccountCreationSessionAPIVerificationResponse>() {
                                                                                                                                                                                                  @Override
                                                                                                                                                                                                  public void onResponse(Call<AccountCreationSessionAPIVerificationResponse> call, Response<AccountCreationSessionAPIVerificationResponse> response) {
                                                                                                                                                                                                      if (response.isSuccessful() && response.body() != null) {
                                                                                                                                                                                                          AccountCreationSessionAPIVerificationResponse result = response.body();
                                                                                                                                                                                                          if (result.isSuccess()) {
                                                                                                                                                                                                          }
                                                                                                                                                                                                      } else {
                                                                                                                                                                                                          Toast.makeText(SignupActivity.this, "Error!", Toast.LENGTH_SHORT).show();
                                                                                                                                                                                                      }
                                                                                                                                                                                                  }

                                                                                                                                                                                                  @Override
                                                                                                                                                                                                  public void onFailure(Call<AccountCreationSessionAPIVerificationResponse> call, Throwable throwable) {
                                                                                                                                                                                                  }
                                                                                                                                                                                              });
                                                                                                                                                                                          }
                                                                                                                                                                                      });
//});
                                                                                                                                                                                  }
                                                                                                                                                                              });
                                                                                                                                                                          } else {
                                                                                                                                                                              Toast.makeText(SignupActivity.this, "Error!", Toast.LENGTH_SHORT).show();
                                                                                                                                                                          }
                                                                                                                                                                      }
                                                                                                                                                                  }
                                                                                                                                                                  @Override
                                                                                                                                                                  public void onFailure(Call<AccountCreationSessionAPIResponse> call, Throwable throwable) {
                                                                                                                                                                  }
                                                                                                                                                              });
                                                                                                                                                          }
                                                                                                                                                      }
                                                                                                                                                  }

                                                                                                                       );
                                                                                                                   }
                                                                                                               });
                                                                                                           }
                                                                                                       } else {
                                                                                                           Toast.makeText(SignupActivity.this, "Error!", Toast.LENGTH_SHORT).show();
                                                                                                       }
                                                                                                   }
                                                                                               });

//});
                                                                                           }
                                                                                       });
                                                                                   } else {
                                                                                       Toast.makeText(SignupActivity.this, "Error!", Toast.LENGTH_SHORT).show();
                                                                                   }
                                                                               }
                                                                           }
                                                                           @Override
                                                                           public void onFailure(Call<AccountCreationSessionAPIResponse> call, Throwable throwable) {
                                                                           }
                                                                       });
                                                                   }
                                                               }
                                                           }

                                );
                            }
                        });

                    }
                });
            }
        });

    }
}