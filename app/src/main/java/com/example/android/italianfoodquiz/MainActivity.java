package com.example.android.italianfoodquiz;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int score = 0;
    // Q1
    RadioButton radioButtonQ1;
    RadioGroup radioGroupQ1;
    // Q2
    EditText editTextQ2;
    // Q3
    CheckBox checkBoxN1Q3;
    CheckBox checkBoxN2Q3;
    CheckBox checkBoxN3Q3;
    CheckBox checkBoxN4Q3;
    // Q4
    RadioButton radioButtonQ4;
    RadioGroup radioGroupQ4;
    // Q5
    EditText editTextQ5;
    // Q6
    RadioButton radioButtonQ6;
    RadioGroup radioGroupQ6;
    // Q7
    CheckBox checkBoxN1Q7;
    CheckBox checkBoxN2Q7;
    CheckBox checkBoxN3Q7;
    CheckBox checkBoxN4Q7;
    // Q8
    RadioButton radioButtonQ8;
    RadioGroup radioGroupQ8;
    // Q9
    RadioButton radioButtonQ9;
    RadioGroup radioGroupQ9;
    // Q10
    EditText editTextQ10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Q1
        // Retrieve the right answer button.
        radioButtonQ1 = (RadioButton) findViewById(R.id.cream);
        // Retrieve the entire radio group to reset.
        radioGroupQ1 = (RadioGroup) findViewById(R.id.radio_group_q1);
        // Q2
        // Retrieve the EditText view.
        editTextQ2 = (EditText) findViewById(R.id.edit_text_q2);
        // Q3
        // Retrieve four checkboxes.
        checkBoxN1Q3 = (CheckBox) findViewById(R.id.answer_3_one);
        checkBoxN2Q3 = (CheckBox) findViewById(R.id.answer_3_two);
        checkBoxN3Q3 = (CheckBox) findViewById(R.id.answer_3_three);
        checkBoxN4Q3 = (CheckBox) findViewById(R.id.answer_3_four);
        // Q4
        // Retrieve the right answer button.
        radioButtonQ4 = (RadioButton) findViewById(R.id.true_value_q4);
        // Retrieve the entire radio group to reset.
        radioGroupQ4 = (RadioGroup) findViewById(R.id.radio_group_q4);
        // Q5
        // Retrieve the EditText view.
        editTextQ5 = (EditText) findViewById(R.id.answer_5);
        // Q6
        // Retrieve the right answer button.
        radioButtonQ6 = (RadioButton) findViewById(R.id.true_value_q6);
        // Retrieve the entire radio group to reset.
        radioGroupQ6 = (RadioGroup) findViewById(R.id.radio_group_q6);
        // Q7
        // Retrieve four checkboxes.
        checkBoxN1Q7 = (CheckBox) findViewById(R.id.answer_7_one);
        checkBoxN2Q7 = (CheckBox) findViewById(R.id.answer_7_two);
        checkBoxN3Q7 = (CheckBox) findViewById(R.id.answer_7_three);
        checkBoxN4Q7 = (CheckBox) findViewById(R.id.answer_7_four);
        // Q8
        // Retrieve the right answer button.
        radioButtonQ8 = (RadioButton) findViewById(R.id.true_value_q8);
        // Retrieve the entire radio group to reset.
        radioGroupQ8 = (RadioGroup) findViewById(R.id.radio_group_q8);
        // Q9
        // Retrieve the right answer button.
        radioButtonQ9 = (RadioButton) findViewById(R.id.recipe3);
        // Retrieve the entire radio group to reset.
        radioGroupQ9 = (RadioGroup) findViewById(R.id.radio_group_q9);
        // Q10
        // Retrieve the EditText view.
        editTextQ10 = (EditText) findViewById(R.id.answer_10);
    }

    /**
     * Save UI state changes to the savedInstanceState.
     * This bundle will be passed to onCreate if the process is
     * killed and restarted.
     */
    public void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        savedInstanceState.putInt("score", score);
    }

    /**
     * Restore UI state from the savedInstanceState.
     * This bundle has also been passed to onCreate.
     */
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        score = savedInstanceState.getInt("score");
    }

    /**
     * Method called when submit button clicked.
     * This method:
     * check each answer,
     * update the global variable score,
     * display a toast with the final score,
     * reset global variable score.
     */
    public void displayScore(View view) {

        // Q1
        // Retrieve status from the right button.
        boolean rightAnswerQ1 = radioButtonQ1.isChecked();
        // Check if the checked button is correct and add 1 point to score.
        if (rightAnswerQ1) {
            score += 1;
        }

        // Q2
        // Retrieve the string edited by the user.
        String rightAnswerQ2 = editTextQ2.getText().toString().trim();
        // Log.v("MainActivity", "YOU THINK THE ANSWER IS: " + answer);

        // Check if the answer is correct and add 1 point to score.
        // Apply equalsIgnoreCase for better user experience.
        String basil = getString(R.string.basil);
        if (rightAnswerQ2.equalsIgnoreCase(basil)) {
            score += 1;
        }

        // Q3
        // Retrieve status from all checkboxes (they are all true).
        boolean answerN1Q3 = checkBoxN1Q3.isChecked();
        boolean answerN2Q3 = checkBoxN2Q3.isChecked();
        boolean answerN3Q3 = checkBoxN3Q3.isChecked();
        boolean answerN4Q3 = checkBoxN4Q3.isChecked();

        // Check if all answers are true and add 1 point to score.
        if (answerN1Q3 && answerN2Q3 && answerN3Q3 && answerN4Q3) {
            score += 1;
        }

        // Q4
        // Retrieve status only from the right button.
        boolean trueAnswerQ4 = radioButtonQ4.isChecked();
        // Check if the checked button is correct and add 1 point to score.
        if (trueAnswerQ4) {
            score += 1;
        }

        // Q5
        // Retrieve the string edited by the user.
        EditText editTextQ5 = (EditText) findViewById(R.id.answer_5);
        String answerQ5 = editTextQ5.getText().toString().trim();

        // Check if the answer is correct and add 1 point to score.
        // Apply equalsIgnoreCase for better user experience.
        String cannoli = getString(R.string.cannoli);
        String cannoliIt = getString(R.string.cannoli_it);
        if (answerQ5.equalsIgnoreCase(cannoli) || answerQ5.equalsIgnoreCase(cannoliIt)) {
            score += 1;
        }

        // Q6
        // Retrieve status only from the right button.
        boolean trueAnswerQ6 = radioButtonQ6.isChecked();
        // Check if the checked button is correct and add 1 point to score.
        if (trueAnswerQ6) {
            score += 1;
        }

        // Q7
        // Retrieve status from all checkboxes (Q1 and Q$ are true).
        boolean answerN1Q7 = checkBoxN1Q7.isChecked();
        boolean answerN2Q7 = checkBoxN2Q7.isChecked();
        boolean answerN3Q7 = checkBoxN3Q7.isChecked();
        boolean answerN4Q7 = checkBoxN4Q7.isChecked();

        // Check if Q1 and Q4 are true and add 1 point to score.
        if ((answerN1Q7 && answerN4Q7) && (!answerN2Q7 && !answerN3Q7)) {
            score += 1;
        }

        // Q8
        // Retrieve status only from the right button.
        boolean trueAnswerQ8 = radioButtonQ8.isChecked();
        // Check if the checked button is correct and add 1 point to score.
        if (trueAnswerQ8) {
            score += 1;
        }

        // Q9
        // Retrieve status from the right button.
        boolean rightAnswerQ9 = radioButtonQ9.isChecked();
        // Check if the checked button is correct and add 1 point to score.
        if (rightAnswerQ9) {
            score += 1;
        }

        // Q10
        // Retrieve the string edited by the user.
        EditText editTextQ10 = (EditText) findViewById(R.id.answer_10);
        String rightAnswerQ10 = editTextQ10.getText().toString().trim();

        // Check if the answer is correct and add 1 point to score.
        String orecchiette = getString(R.string.orecchiette);
        if (rightAnswerQ10.equalsIgnoreCase(orecchiette)) {
            score += 1;
        }

        // END of Quiz
        // Display a different toast for different values of score.
        String toastMessage = null;

        if (score == 0) {
            toastMessage = getString(R.string.toast_message_if_0, score);
        }
        if (score == 1) {
            toastMessage = getString(R.string.toast_message_if_1, score);
        }
        if (score == 2 || score == 3 || score == 4) {
            toastMessage = getString(R.string.toast_message_if_2to4, score);
        }
        if (score == 5 || score == 6 || score == 7) {
            toastMessage = getString(R.string.toast_message_if_5to7, score);
        }
        if (score == 8 || score == 9) {
            toastMessage = getString(R.string.toast_message_if_8or9, score);
        }
        if (score == 10) {
            toastMessage = getString(R.string.toast_message_if_10, score);
        }

        Toast.makeText(this, toastMessage, Toast.LENGTH_LONG).show();

        // Reset global variable score.
        score = 0;
    }

    /**
     * Method called when retake button clicked.
     * This method:
     * goes on top of ScrollView,
     * resets global variable score,
     * resets each answer.
     */
    public void retakeQuiz(View view) {
        // Reset global variable score.
        // Not necessary, but better repeat this action.
        score = 0;
        // Q1
        // Reset RadioButtons to unchecked.
        radioGroupQ1.clearCheck();
        // Q2
        // Reset EditText to hint string value.
        editTextQ2.setText("");
        editTextQ2.setHint(R.string.green);
        // Q3
        // Reset CheckBoxes to unchecked.
        checkBoxN1Q3.setChecked(false);
        checkBoxN2Q3.setChecked(false);
        checkBoxN3Q3.setChecked(false);
        checkBoxN4Q3.setChecked(false);
        // Q4
        // Reset all RadioButtons to unchecked.
        radioGroupQ4.clearCheck();
        // Q5
        // Reset EditText to hint string value.
        editTextQ5.setText("");
        editTextQ5.setHint(R.string.from_sicily);
        // Q6
        // Reset RadioButtons to unchecked.
        radioGroupQ6.clearCheck();
        // Q7
        // Reset CheckBoxes to unchecked.
        checkBoxN1Q7.setChecked(false);
        checkBoxN2Q7.setChecked(false);
        checkBoxN3Q7.setChecked(false);
        checkBoxN4Q7.setChecked(false);
        // Q8
        // Reset RadioButtons to unchecked.
        radioGroupQ8.clearCheck();
        // Q9
        // Reset RadioButtons to unchecked.
        radioGroupQ9.clearCheck();
        // Q10
        // Reset EditText to hint string value.
        editTextQ10.setText("");
        editTextQ10.setHint(R.string.ears);
        // Go on top of ScrollView for better user experience.
        ScrollView scroll_view = (ScrollView) findViewById(R.id.activity_main);
        scroll_view.fullScroll(ScrollView.FOCUS_UP);
        // Prevent focus on any of EditText.
        editTextQ2.clearFocus();
        editTextQ5.clearFocus();
        editTextQ10.clearFocus();
    }

    /**
     * Create intent.
     * Open link in browser when the open_browser_button is clicked.
     */
    public void openBrowser(View view) {
        String url = "https://en.wikipedia.org/wiki/Italian_cuisine";
        Intent browserIntent = new Intent(Intent.ACTION_VIEW);
        browserIntent.setData(Uri.parse(url));
        startActivity(browserIntent);

        if (browserIntent.resolveActivity(getPackageManager()) != null) {
            startActivity(browserIntent);
        }
    }

} // end MainActivity
