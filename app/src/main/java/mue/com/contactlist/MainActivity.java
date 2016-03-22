package mue.com.contactlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
        DatabaseHandler db = new DatabaseHandler(this);

        //adding crud operations...
        Log.d("Insert: ", "Inserting ..");
        db.addContact(new Contacts("Elvis", "2585258"));
        db.addContact(new Contacts("Anto", "147414474"));
        db.addContact(new Contacts("Frank", "32659856"));
        db.addContact(new Contacts("Stern", "98745632"));

// Reading all contacts
        Log.d("Reading: ", "Reading all contacts..");
        List<Contacts> contacts = db.getAllContacts();

        for (Contacts cn : contacts) {
            String log = "Id: "+cn.get_id()+" ,Name: " + cn.get_name() + " ,Phone: " + cn.get_phone_number();
            // Writing Contacts to log
            Log.d("Name: ", log);
        }
    }

}
