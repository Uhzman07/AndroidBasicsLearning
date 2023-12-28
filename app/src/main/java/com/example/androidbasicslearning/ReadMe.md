Note that the layout gravity attribute of the Bottom app bar allows the bar to stick to the bottom of the page
The layout anchor attribute of the floating action bar allows it the floating action bar to stick to the Bottom app bar by specifying the id
We also have to change the theme of the app in the styles.xml file so as to make the floating action bar effective this can be done by making use of  <style name="Theme.AndroidBasicsLearning" parent="Theme.MaterialComponents">
Also note that the empty item in the bottom navigation view which is android:id="@+id/placeholder" was used to create a sort of space
%% But still, the middle empty item seems to be clickable either ways so to stop this, we have to do that in the MainActivity class
