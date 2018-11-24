# SimilarSDK Android

[![N|Solid](http://www.streamoid.com/images/logo.png)](http://www.streamoid.com/)

This repository contains binary distributions of SimilarSDK Android framework.

If you have any questions, comments, or issues related to SimilarSDK, Please contact the team by emailing support@streamoid.com.


### SimilarSDK

SimilarSDK is an Android framework for displaying vendor products list based on configuration. SimilarSDK framework provided by Streamoid Technologies lets you seemlessly integrate visual search feature into your native android applications



### Installation

### Binary

You may [download AAR releases here.](https://github.com/streamoid/SimilarSdkAndroid/releases)

### SETUP

1. Copy the streamoid aar file to libs folder in project 


2. Copy the below arguments to build.gradle (app  module) in dependencies block 

```
	dependencies {
		implementation(name : 'streamoid-1.1',ext:'aar') // build tool version >=27
		  
		   Or 

		compile(name : 'streamoid-1.1',ext:'aar') // build tool version <27 
	}
```
3. Copy the below arguments to build.gradle(app  module)  to Load the aar file in libs folder 
```
	repositories {
	    flatDir {
		dirs 'libs'
	    }

	}
```

4. Sync the project 

5. Add config.json in assets folder 

6. Add font files in assets/fonts/  folder Which are mentioned in config.json file  fontName attribute 

7. Add this layout to Xml file 

```
     <com.streamoid.product.ProductWidget.ProductListWidget
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                app:vendorId="270811"
        app:vendorName=”v_pantaloons”
                android:id="@+id/product_view">
     </com.streamoid.product.ProductWidget.ProductListWidget>

```

8. Add Application file in App  See the below code 

 ```   

    public class SampleApplication extends Application {

        @Override
        public void onCreate() {
            super.onCreate();
        }
    }
    
    
    
 ```
 
 9. Add that application class name on the manifest File like this 
 ```



    <application

       android:label="@string/app_name"
       android:name=".SampleApplication">
       
       
       
 ```

10 . Add Permission in Manifest File 
```


<uses-permission android:name="android.permission.INTERNET"/>


```

11. Add sdk Initialize code in Application Class  

 ```
 
 
    public class SampleApplication extends Application {

        @Override
        public void onCreate() {
            super.onCreate();
            SDKManager.initialize(this);

        }
    }
    
    
    
    
 ```


12. vendorId,vendorName attribute are mandatory for this view . If vendorId,vendorName are not given, view is not showing any content


### Contact

You can reach the Streamoid team at any time by emailing support@streamoid.com.

