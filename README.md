# WheelView
这是一个仿ios滚轮的控件，可以用于滚动选择。本组件根据loopView控件扩展修改的，loopView项目地址：https://github.com/weidongjian/androidWheelView

在原有的基础上添加一些自定义设置，可根据自己的需求修改。具体的请查看这个博客：https://blog.csdn.net/weixin_42046829/article/details/110070927

 ![image](https://github.com/MattLjp/WheelView/blob/master/phone/show.gif)

# gradle依赖
```java
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```

```java
  dependencies {
	    implementation 'com.github.MattLjp:WheelView:1.0.0'
	}
```

# Demo
Use the MyWheelView as a View, Java and XML are both supported.
Java:

```java
    public class MainActivity extends Activity {
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main)
            
            MyWheelView myWheelView = findViewById(R.id.myWheelView);
            // 设置列表显示的数量
            myWheelView.setItemsVisibleCount(5);
            List mOptionsItems = new ArrayList<>();
        	for (int i = -5; i <= 5; i++) {
            mOptionsItems.add(String.valueOf(i));
        	}
        	// 设置数据集合
        	myWheelView.setItems(mOptionsItems);
        	// 设置选中的字体大小
        	myWheelView.setTextSize(32);
        	myWheelView.setOnItemSelectedListener(index -> {
        		Toast.makeText(this, "选中：" + mOptionsItems.get(index), Toast.LENGTH_SHORT).show();
        	});

        }
    }
```

XML:

```xml
    <com.matt.mywheelview.MyWheelView
            android:id="@+id/wheelview"
            android:layout_width="match_parent"
            android:layout_height="wrap_content" />
```

# Description of Attributes

Attributes|	Format|	Default	| Description
--|--|--|--
awv_textsize|	integer|	15|	textsize
awv_lineSpace|	float|	2.0f|	line space
awv_centerTextColor|	integer|	0xff313131|	center text color
awv_outerTextColor|	integer|	0xffafafaf|	outer text color
awv_dividerTextColor|	integer	| 0xff313131|	center text color
awv_itemsVisibleCount|	integer	|9|	visible item count
awv_isLoop	|boolean|	true|	is loop mode

# Methods:
method 方法|	description 描述
--|--
void setItems(List list)	| 设置滚轮数据
void setCyclic(boolean loop)|	设置滚轮是否循环滚动
void setItemsVisibleCount(int visibleNumber)|设置列表显示的数量
void setCurrentItem(final int selection)|	设置当前选中项
int getCurrentItem()| 获取当前选中项
void setLineSpacingMultiplier(float lineSpacingMultiplier)|设置每项的间距，必须大于1
int getItemsCount()	| 获取列表数目
void setTextSize(float size)|	设置选中的字体大小
void setTypeface(Typeface font)| 设置字体
void setCenterTextColor(int centerTextColor)|设置非选中项颜色
void setOuterTextColor(int outerTextColor)|设置选中项颜色
void setDividerColor(int dividerColor)|设置分割线颜色
void  setDividerType(DividerType dividerType)|设置分割线类型
 void setLabel(String label)|设置附加单位
 void isCenterLabel(boolean isCenterLabel)|设置附加单位位置
 void setIsOptions(boolean options)|设置附加单位可滚动
void setOnItemSelectedListener(OnItemSelectedListener OnItemSelectedListener)|	设置滚轮停止监听事件
