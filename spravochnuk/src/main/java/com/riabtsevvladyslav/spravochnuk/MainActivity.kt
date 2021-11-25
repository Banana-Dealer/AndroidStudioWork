package com.riabtsevvladyslav.spravochnuk

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.ImageView
import android.widget.RadioButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_item,menu)
        return true
    }

    override fun onPrepareOptionsMenu(menu: Menu?): Boolean {
        val radio1 = findViewById<RadioButton>(R.id.animals)
        val radio2 = findViewById<RadioButton>(R.id.plants)

        menu?.setGroupVisible(R.id.group1, radio1.isChecked)
        menu?.setGroupVisible(R.id.group2, radio2.isChecked)
    return super.onPrepareOptionsMenu(menu)
    }

    @SuppressLint("UseCompatLoadingForDrawables")
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val mainTitle = findViewById<TextView>(R.id.start_title)
        val mainDescription = findViewById<TextView>(R.id.start_description)
        val mainImage = findViewById<ImageView>(R.id.start_image)

        when (item.itemId){
            R.id.golyb->{
                mainDescription.text = resources.getString(R.string.golub_text)
                mainTitle.text = resources.getTextArray(R.array.bird_list)[0]
                mainImage.setImageDrawable(getDrawable(R.drawable.golub))
            }
            R.id.orel->{
                mainDescription.text = resources.getString(R.string.orel_text)
                mainTitle.text = resources.getTextArray(R.array.bird_list)[1]
                mainImage.setImageDrawable(getDrawable(R.drawable.orel))
            }
            R.id.sova->{
                mainDescription.text = resources.getString(R.string.sova_text)
                mainTitle.text = resources.getTextArray(R.array.bird_list)[2]
                mainImage.setImageDrawable(getDrawable(R.drawable.sova))
            }
            R.id.volk->{
                mainDescription.text = resources.getString(R.string.voolk_text)
                mainTitle.text = resources.getTextArray(R.array.mammals_list)[0]
                mainImage.setImageDrawable(getDrawable(R.drawable.voolk))
            }
            R.id.sobaka->{
                mainDescription.text = resources.getString(R.string.sobaka_text)
                mainTitle.text = resources.getTextArray(R.array.mammals_list)[1]
                mainImage.setImageDrawable(getDrawable(R.drawable.sobaka))
            }
            R.id.koshka->{
                mainDescription.text = resources.getString(R.string.koshka_text)
                mainTitle.text = resources.getTextArray(R.array.mammals_list)[2]
                mainImage.setImageDrawable(getDrawable(R.drawable.koshka))
            }
            R.id.triton->{
                mainDescription.text = resources.getString(R.string.triton_text)
                mainTitle.text = resources.getTextArray(R.array.amphibias_list)[0]
                mainImage.setImageDrawable(getDrawable(R.drawable.triton))
            }
            R.id.jabba->{
                mainDescription.text = resources.getString(R.string.jabka_txt)
                mainTitle.text = resources.getTextArray(R.array.amphibias_list)[1]
                mainImage.setImageDrawable(getDrawable(R.drawable.zhaba))
            }
            R.id.salamandra->{
                mainDescription.text = resources.getString(R.string.salamandra_txt)
                mainTitle.text = resources.getTextArray(R.array.amphibias_list)[2]
                mainImage.setImageDrawable(getDrawable(R.drawable.salamandra))
            }
            R.id.armeria->{
                mainDescription.text = resources.getString(R.string.armeria_txt)
                mainTitle.text = resources.getTextArray(R.array.amphibias_list)[0]
                mainImage.setImageDrawable(getDrawable(R.drawable.armeria))
            }
            R.id.dianthus->{
                mainDescription.text = resources.getString(R.string.dianthus_txt)
                mainTitle.text = resources.getTextArray(R.array.amphibias_list)[1]
                mainImage.setImageDrawable(getDrawable(R.drawable.dianthus))
            }
            R.id.lewisia->{
                mainDescription.text = resources.getString(R.string.lewiia_txt)
                mainTitle.text = resources.getTextArray(R.array.amphibias_list)[2]
                mainImage.setImageDrawable(getDrawable(R.drawable.lewisia))
            }
            R.id.cornflower->{
                mainDescription.text = resources.getString(R.string.cornflower_txt)
                mainTitle.text = resources.getTextArray(R.array.annual_behinnial_list)[0]
                mainImage.setImageDrawable(getDrawable(R.drawable.cornflower))
            }
            R.id.poppy->{
                mainDescription.text = resources.getString(R.string.poppy_txt)
                mainTitle.text = resources.getTextArray(R.array.annual_behinnial_list)[1]
                mainImage.setImageDrawable(getDrawable(R.drawable.poppy))
            }
            R.id.clarkia->{
                mainDescription.text = resources.getString(R.string.clarcia_txt)
                mainTitle.text = resources.getTextArray(R.array.annual_behinnial_list)[2]
                mainImage.setImageDrawable(getDrawable(R.drawable.clarkia))
            }
            R.id.moneywort->{
                mainDescription.text = resources.getString(R.string.moneywort_txt)
                mainTitle.text = resources.getTextArray(R.array.aquatic_list)[0]
                mainImage.setImageDrawable(getDrawable(R.drawable.moneywort))
            }
            R.id.hornwort->{
                mainDescription.text = resources.getString(R.string.hornwort_txt)
                mainTitle.text = resources.getTextArray(R.array.aquatic_list)[1]
                mainImage.setImageDrawable(getDrawable(R.drawable.hornwort))
            }
            R.id.rotala->{
                mainDescription.text = resources.getString(R.string.rotala_txt)
                mainTitle.text = resources.getTextArray(R.array.aquatic_list)[2]
                mainImage.setImageDrawable(getDrawable(R.drawable.rotala))
            }
        }
        return super.onOptionsItemSelected(item)
    }
}
