package `in`.mvpstarter.sample.injection.component

import `in`.mvpstarter.sample.injection.PerActivity
import `in`.mvpstarter.sample.injection.module.ActivityModule
import `in`.mvpstarter.sample.ui.base.BaseActivity
import `in`.mvpstarter.sample.ui.detail.DetailActivity
import `in`.mvpstarter.sample.ui.main.MainActivity
import dagger.Subcomponent

@PerActivity
@Subcomponent(modules = arrayOf(ActivityModule::class))
interface ActivityComponent {
    fun inject(baseActivity: BaseActivity)

    fun inject(mainActivity: MainActivity)

    fun inject(detailActivity: DetailActivity)
}
