package demo.com.demoapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    ApiInterface apiInterface;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        chekcData();

    }

    private void chekcData() {
        apiInterface = ApiClient.getClient().create(ApiInterface.class);
       // LoginReq loginReq = new LoginReq("ashvin.ebiztrait@gmail.com", 69506, 2, "29 Khalid Ibn Al Waleed St, Kuwait City, Kuwait", 1, "gdfgdfgdg sdfgdfgdfgdf dfgdfg");
        User user = new User("morpheus", "leader");
        Call<User> call1 = apiInterface.getLoginResCall(user);
        call1.enqueue(new Callback<User>() {
            @Override
            public void onResponse(Call<User> call, Response<User> response) {

               Toast.makeText(MainActivity.this, "Success.............."+String.valueOf(response.body().job.toString()), Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onFailure(Call<User> call, Throwable t) {
                Toast.makeText(getApplicationContext(), "Success.............."+String.valueOf(t), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
