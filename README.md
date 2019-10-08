[![](https://jitpack.io/v/amirkateb/AnimationDialogAndroid.svg)](https://jitpack.io/#amirkateb/AnimationDialogAndroid)
# AnimationDialogAndroid
A Easy And Powerfull Library For Android Dialog

## Beuty Dialog With Animation,sound,Picture And....
![](AnimationDialogAndroid.gif)

### How Install...               
####1. Add To Your build.gradle(project)

```javascript
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  ```
  
####2. Add To Your build.gradle(App)
```javascript
	dependencies {
	        implementation 'com.github.amirkateb:AnimationDialogAndroid:1.1.1'
	}
```

####3.add Lottie To Your Project
This Library Use [Lottie](https://github.com/airbnb/lottie-android "Lottie") For Show Animation
(You Can Download Many Free Animation in Json Format in [LottieFiles]( https://lottiefiles.com "LottieFiles")

```javascript
dependencies {
  implementation 'com.airbnb.android:lottie:3.0.7'
}
```
### How To Use...  
####1.Init AnimationDialog
```javascript
//Activity is your Activity Or Context like MainActivity.this
AnimationDialog.init(Activity,boolean your choice); //boolean your choice:you can use gride button(true) or linear buton(false)
```
This Method Return Buttons Array For Buttons Method So:
```javascript
Button[] buttons;
buttons=AnimationDialog.init(Activity,boolean your choice); //Activity is your Activity Or Context like MainActivity.this
```

####2.Create Your Dialog
```javascript
AnimationDialog.create("Title","Sub Text","Button Text!");
```
####3.Buttons Click
```javascript
buttons[0].setOnClickListener(new View.OnClickListener() {
   @Override
public void onClick(View view) {
    AnimationDialog.close();
}
});
```
If Add Secend Button...
```javascript
buttons[0].setOnClickListener(new View.OnClickListener() {
   @Override
public void onClick(View view) {
    AnimationDialog.close();
}
});

buttons[1].setOnClickListener(new View.OnClickListener() {
   @Override
public void onClick(View view) {
    AnimationDialog.close();
}
});
```
####4.Customize Your 
```javascript
//hex color like #000000
AnimationDialog.add_secend_button("Button Text","colorHex for background buttons color"); 
AnimationDialog.set_animation("name of your json file name in assets folder","colorHex for background color");
AnimationDialog.set_Sound(your file adress in raw folder); //like R.raw.error
AnimationDialog.set_parent_background("colorHex for background color");
AnimationDialog.change_text_color("colorHex for text color");
AnimationDialog.setCanceledOnTouchOutside(boolean true or false);
AnimationDialog.custom_button_background("#FF1744"); //for your first Button (default its red with curner radius)
AnimationDialog.set_image(your drawable); //you can use on of the animationview or imageview
```

### More Customize...
Some Methods Return Usefull Value...So You Can:
```javascript
Dialog dialog;
MediaPlayer mediaPlayer;
LottieAnimationView lottieAnimationView;

dialog=AnimationDialog.create("Title","Sub Text","Button Text!");
mediaPlayer=AnimationDialog.set_Sound(your file adress in raw folder);
lottieAnimationView=AnimationDialog.set_animation("name of your json file name in assets folder","colorHex for background color");
```
### For More Example You Can See SampleApp Folder

###Thanks For Yor Attantion
####AmirMohammad KatebSaber [MySite In Persian Language](https://katebsaber.ir "MySite")

##End
