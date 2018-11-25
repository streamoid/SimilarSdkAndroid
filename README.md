# SimilarSDK Android

[![N|Solid](http://www.streamoid.com/images/logo.png)](http://www.streamoid.com/)

This repository contains binary distributions of SimilarSDK Android framework.

If you have any questions, comments, or issues related to SimilarSDK, Please contact the team by emailing support@streamoid.com.


### SimilarSDK

SimilarSDK is an Android framework for displaying vendor similar products list based on configuration. SimilarSDK framework provided by Streamoid Technologies lets you seemlessly integrate visual search feature into your native android applications


### SETUP

### JCenter

Add JCenter to your build file's list of repositories.

```
repositories {
    jcenter()
}
```

to use the JCenter Repository

```
dependencies {
    ...
    	implementation 'com.streamoid.product:streamoid:1.0.0' 
		  
	Or 

	compile 'com.streamoid.product:streamoid:1.0.0'
    ...
}
```


Sync the project 

Add **config.json** in assets folder 

Add font files in **assets/fonts/**  folder Which are mentioned in **config.json** file  fontName attribute 

Add this layout to Xml file 

```
     <com.streamoid.product.ProductWidget.ProductListWidget
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                **app:vendorId="270811"
        	app:vendorName=”v_pantaloons”**
                android:id="@+id/product_view">
     </com.streamoid.product.ProductWidget.ProductListWidget>

```

Add Application file in App  See the below code 

 ```   

    public class SampleApplication extends Application {

        @Override
        public void onCreate() {
            super.onCreate();
        }
    }
    
    
    
 ```
 
Add that application class name on the manifest File like this 
 ```



    <application

       android:label="@string/app_name"
       android:name=".SampleApplication">
       
       
       
 ```

Add Permission in Manifest File 
```


<uses-permission android:name="android.permission.INTERNET"/>


```

Add sdk Initialize code in Application Class  

 ```
 
 
    public class SampleApplication extends Application {

        @Override
        public void onCreate() {
            super.onCreate();
            SDKManager.initialize(this);

        }
    }
    
    
    
    
 ```


**vendorId,vendorName** attribute are mandatory for this view . If **vendorId,vendorName** are not given, view is not showing any content



## Configuration (config.json) 


**config.json**

```

{

  "portraitTileCount":0,
  "landscapeTileCount":0,
  "orientation":"horizontal",
  "swipeEnable":true,
  "maxItemCount":0,

  "tileConfig": {
    "textRows": [
      {
        "id": 1,
        "align": "center-align",
        "marginTopBottom": 5,
        "columns": [
          {
            "name": "Brand Name",
            "fontSize": 5,
            "textColor": "#909080",
            "fontName": "roboto_bold.ttf"

          }
        ]
      },
      {
        "id": 2,
        "align": "center-align",
        "marginTopBottom": 5,
        "columns": [
          {
            "name": "Product Name",
            "fontSize": 6,
            "textColor": "#99999A",
            "boldEnable": true,
            "fontName": "roboto_medium.ttf"

          }
        ]
      },
      {
        "id": 3,
        "align": "center-align",
        "marginLeftRight": 5,
        "marginTopBottom": 5,
        "columns": [
          {
            "name": "Description",
            "fontSize": 8,
            "textColor": "#66666A",
            "maxCharLength": 20,
            "fontName": "ostrich_regular.ttf"

          }
        ]
      },
      {
        "id": 5,
        "align": "center-align",
        "marginLeftRight": 5,
        "marginTopBottom": 5,
        "columns": [
          {
            "name": "Price",
            "fontSize": 6,
            "textColor": "#1FAE06",
            "marginLeftRight": 10,
            "fontName": "roboto_regular.ttf"

          },
          {
            "name": "Discount Price",
            "fontSize": 6,
            "strikeOutEnable": true,
            "textColor": "#1FAE06",
            "marginLeftRight": 10,
            "fontName": "roboto_regular.ttf"

          }
        ]
      }
    ],
    "image": {
      "width": 300,
      "height": 400,
      "marginTopBottom": 10,
      "marginLeftRight": 10
    }
  },

  "header": {
    "lineHeight":1,
    "title":"",
    "lineStyle":"dashedLine",
    "lineColor":"#33333A",
    "fontSize":9,
    "textColor":"#008080",
    "marginLeftRight":10,
    "fontName":"roboto_bold.ttf",
    "dashWidth":10
  },

  "footer": {
    "lineHeight":1,
    "lineStyle":"line",
    "lineColor":"#33333A",
    "fontSize":9,
    "textColor":"#008080",
    "marginLeftRight":10,
    "fontName":"roboto_bold.ttf"
  }
}



```

 
 ## Tile Count (portraitTileCount, landscapeTileCount) 

        landscapeTileCount - tiles Count for landscape mode 
        portraitTileCount  - tiles count for portrait mode 

        tiles Count for landscape and protrait mode needs to be define  to handle the orientation change 



 ## Orientation (horizontal,vertical)
       
       
        Type of Widget  : horizontal or vertical
          


## SwipeEnable (swipeEnable)

        To Enable Swipe (Scroll) or disable the scroll (move  by arrow )
        If u enable the Swipe it hide the arrow , u can scroll  up to end
        If u disable the swipe ,it show arrows to move the items based on tileCount 
  


## MaximumItemCount(maxItemCount)

       To Show Maximum number of item in List  
       If u give maxItemCount =0 , it will show all the items 
       If u give any sepecific count maxItemCount =10 , it will show only 10 items 

## Tile Configuration(tileConfig)
         
       It Contains the image Configuration and textRows Configuration 


 ## Image configuration  (image)

       width  - width of the image 
       height - height of the image	
       marginTopBottom - margin for top and bottom of the image (Integer) 
       marginLeftRight - margin for left and right of the image (Integer)
       scaleType - Scale Type is left ,right ,center

 ## Rows Of text (textRows)

       id - id for the row(Integer)
       align - How should be align (left-align,right-align, center-align)
       marginLeftRight - Margin for left and right of row view 
       marginTopBottom - margin for top and bottom of the row
       Columns[] - list of columns in a row


 ## Column Of Each Row (columns)
	
       fontName    - custom font name roboto_regular.ttf (font file should be defined in  assets/fonts with same name 
       fontSize   - Font Size of the Text  , it should be integer
       textColor  - Text Color  it should be String (#909090)
	
       name       - key to display value in this field ( Brand Name, Product Name ) 
       boldEnable - Enable bold Text (boolean)
       strikeOutEnable - Enable Strike out Text (boolean) 
       underlineEnable - Enable Underline text (boolean)
       maxLines        - how many lines should be display (Integer) , default it is singleline  
       marginLeftRight - margin for left and right of the view (Integer)
       marginTopBottom - margin for top and bottom of the view (Integer)

## Header and footer of Widget (header,footer)

       lineHeight - lineHeight  (Integer)
       title - Title of the Header 
       lineEnable - line should be shown after and before the text (boolean)
       lineStyle - Style of the line (dashedLine ,line) 
       lineColor - color of the line 
	
       fontName    - custom font name roboto_regular.ttf (font file should be defined in  assets/fonts with same name 
       fontSize   - Font Size of the Text  , it should be integer
       textColor  - Text Color  it should be String (#909090)
       boldText - Text to be bold  (String)
       strikeOutText - Text to be StrikeoutText (String) 
       underlineText - Text to be StrikeoutTex (String)
       maxLines        - how many lines should be display (Integer) 
       marginLeftRight - margin for left and right of the view (Integer)
       marginTopBottom - margin for top and bottom of the view (Integer)



### Contact

You can reach the Streamoid team at any time by emailing support@streamoid.com.

