package gaur.himanshu.august.tablayout.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import gaur.himanshu.august.tablayout.fragments.personales
import gaur.himanshu.august.tablayout.fragments.sustantivos
import gaur.himanshu.august.tablayout.fragments.verbos
import gaur.himanshu.august.tablayout.fragments.cualidades
import gaur.himanshu.august.tablayout.fragments.expresiones

class ViewPagerAdapter(fragmentManager: FragmentManager,lifecycle: Lifecycle): FragmentStateAdapter(fragmentManager, lifecycle) {
    override fun getItemCount(): Int {
        return 5
    }

    override fun createFragment(position: Int): Fragment {
     return   when(position){
            0->{
                personales()
            }
            1->{
                sustantivos()
            }
            2->{
                verbos()
            }
            3->{
                cualidades()
            }
            4->{
                expresiones()
            }
            else->{
                Fragment()
            }

        }
    }
}