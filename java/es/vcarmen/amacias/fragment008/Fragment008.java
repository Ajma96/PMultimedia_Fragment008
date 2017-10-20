package es.vcarmen.amacias.fragment008;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

public class Fragment008 extends FragmentActivity{

    @Override
    protected void onCreate ( Bundle savedInstanceState ) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_fragment008 );

        Header firstFragment = new Header();

        firstFragment.setArguments ( getIntent ().getExtras () );
        getSupportFragmentManager ()
                .beginTransaction ()
                .add ( R.id.container, firstFragment)
                .commit ();


    }
}
