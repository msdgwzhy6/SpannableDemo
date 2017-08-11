package com.example.mraz.spannabledemo;

import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.EmbossMaskFilter;
import android.graphics.LayerRasterizer;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.AlignmentSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.BulletSpan;
import android.text.style.ClickableSpan;
import android.text.style.DrawableMarginSpan;
import android.text.style.DynamicDrawableSpan;
import android.text.style.EasyEditSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.IconMarginSpan;
import android.text.style.ImageSpan;
import android.text.style.LeadingMarginSpan;
import android.text.style.LocaleSpan;
import android.text.style.MaskFilterSpan;
import android.text.style.QuoteSpan;
import android.text.style.RasterizerSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.ScaleXSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.SubscriptSpan;
import android.text.style.SuggestionSpan;
import android.text.style.SuperscriptSpan;
import android.text.style.TextAppearanceSpan;
import android.text.style.TypefaceSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.AbsoluteSizeSpan)
    TextView mAbsoluteSizeSpanTextView;
    @BindView(R.id.AlignmentSpan)
    TextView mAlignmentSpanTextView;
    @BindView(R.id.BackgroundColorSpan)
    TextView mBackgroundColorSpanTextView;
    @BindView(R.id.BulletSpan)
    TextView mBulletSpanTextView;
    @BindView(R.id.ClickableSpan)
    TextView mClickableSpanTextView;
    @BindView(R.id.DrawableMarginSpan)
    TextView mDrawableMarginSpanTextView;
    @BindView(R.id.DynamicDrawableSpan)
    TextView mDynamicDrawableSpanTextView;
    @BindView(R.id.EasyEditSpan)
    TextView mEasyEditSpanTextView;
    @BindView(R.id.LeadingMarginSpan)
    TextView mLeadingMarginSpanTextView;
    @BindView(R.id.LocaleSpan)
    TextView mLocaleSpanTextView;
    @BindView(R.id.MaskFilterSpan)
    TextView mMaskFilterSpanTextView;
    @BindView(R.id.QuoteSpan)
    TextView mQuoteSpanTextView;
    @BindView(R.id.RasterizerSpan)
    TextView mRasterizerSpanTextView;
    @BindView(R.id.RelativeSizeSpan)
    TextView mRelativeSizeSpanTextView;
    @BindView(R.id.ScaleXSpan)
    TextView mScaleXSpanTextView;
    @BindView(R.id.StrikethroughSpan)
    TextView mStrikethroughSpanTextView;
    @BindView(R.id.StyleSpan)
    TextView mStyleSpanTextView;
    @BindView(R.id.SuggestionSpan)
    TextView mSuggestionSpanTextView;
    @BindView(R.id.SuperscriptSpan)
    TextView mSuperscriptSpanTextView;
    @BindView(R.id.TextAppearanceSpan)
    TextView mTextAppearanceSpanTextView;
    @BindView(R.id.TypefaceSpan)
    TextView mTypefaceSpanTextView;
    @BindView(R.id.UnderlineSpan)
    TextView mUnderlineSpanTextView;
    @BindView(R.id.URLSpan)
    TextView mURLSpanTextView;
    @BindView(R.id.ForegroundColorSpan)
    TextView mForegroundColorSpanTextView;
    @BindView(R.id.IconMarginSpan)
    TextView mIconMarginSpanTextView;
    @BindView(R.id.ImageSpan)
    TextView mImageSpanTextView;
    @BindView(R.id.SubscriptSpan)
    TextView mSubscriptSpanTextView;

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        SpannableString spanString = new SpannableString("AbsoluteSizeSpan");
        AbsoluteSizeSpan absoluteSizeSpan = new AbsoluteSizeSpan(100);
        spanString.setSpan(absoluteSizeSpan, 2, 5, Spannable.SPAN_INCLUSIVE_INCLUSIVE);
        mAbsoluteSizeSpanTextView.setText(spanString);

        SpannableString spannableString2 = new SpannableString(
                "AlignmentSpanasdfasdfasdfasdfasdfasdasdfasdfasdasdagsdfsdfasdfsdfasdfasdafsdfsdfsdfsdf");
        AlignmentSpan alignmentSpan = new AlignmentSpan.Standard(Layout.Alignment.ALIGN_CENTER);
        spannableString2.setSpan(alignmentSpan, 0, spannableString2.length(),
                Spannable.SPAN_INCLUSIVE_INCLUSIVE);
        mAlignmentSpanTextView.setText(spannableString2);

        SpannableString spannableString3 = new SpannableString("BackgroundColorSpan");
        BackgroundColorSpan backgroundColorSpan = new BackgroundColorSpan(
                Color.parseColor("#FFAACC"));
        spannableString3.setSpan(backgroundColorSpan, 2, 5, Spanned.SPAN_INCLUSIVE_INCLUSIVE);
        mBackgroundColorSpanTextView.setText(spannableString3);

        SpannableString spannableString4 = new SpannableString("BulletSpan");
        spannableString4.setSpan(new BulletSpan(66, 0xff303F9F), 0, spannableString4.length(),
                Spannable.SPAN_INCLUSIVE_INCLUSIVE);
        mBulletSpanTextView.setText(spannableString4);

        SpannableString spannableString5 = new SpannableString("ClickableSpan");
        spannableString5.setSpan(new ClickableSpan() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Click", Toast.LENGTH_SHORT).show();
            }
        }, 0, 5, Spanned.SPAN_INCLUSIVE_INCLUSIVE);
        mClickableSpanTextView.setText(spannableString5);
        mClickableSpanTextView.setMovementMethod(LinkMovementMethod.getInstance());


        SpannableString spannableString6 = new SpannableString("DrawableMarginSpan");
        DrawableMarginSpan drawableMarginSpan = new DrawableMarginSpan(
                getResources().getDrawable(R.drawable.android), 10);
        spannableString6.setSpan(drawableMarginSpan, 0, 15, Spanned.SPAN_INCLUSIVE_INCLUSIVE);
        mDrawableMarginSpanTextView.setText(spannableString6);

        SpannableString spannableString7 = new SpannableString("DynamicDrawableSpan");
        DynamicDrawableSpan dynamicDrawableSpan = new DynamicDrawableSpan() {
            @Override
            public Drawable getDrawable() {
                Drawable drawable = getResources().getDrawable(R.drawable.android);
                drawable.setBounds(0, 0, 100, 100);
                return drawable;
            }
        };
        spannableString7.setSpan(dynamicDrawableSpan, 0, 4, Spanned.SPAN_INCLUSIVE_INCLUSIVE);
        mDynamicDrawableSpanTextView.setText(spannableString7);

        //
        SpannableString spannableString8 = new SpannableString("EasyEditSpan貌似没效果");
        EasyEditSpan easyEditSpan = new EasyEditSpan();
        spannableString8.setSpan(easyEditSpan, 0, spannableString8.length(),
                Spanned.SPAN_INCLUSIVE_INCLUSIVE);
        mEasyEditSpanTextView.setText(spannableString8);

        //前景色
        SpannableString spannableString9 = new SpannableString("ForegroundColorSpan");
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(
                Color.parseColor("#AABBCC"));
        spannableString9.setSpan(foregroundColorSpan, 1, spannableString9.length() - 1,
                Spanned.SPAN_INCLUSIVE_INCLUSIVE);
        mForegroundColorSpanTextView.setText(spannableString9);

        //图标margin
        SpannableString spannableString10 = new SpannableString(
                "IconMarginSpan------------------------");
        IconMarginSpan iconMarginSpan = new IconMarginSpan(
                BitmapFactory.decodeResource(getResources(), R.mipmap.ic_launcher));
        spannableString10.setSpan(iconMarginSpan, 0, spannableString10.length(),
                Spanned.SPAN_INCLUSIVE_INCLUSIVE);
        mIconMarginSpanTextView.setText(spannableString10);

        //图片
        SpannableString spannableString11 = new SpannableString(
                "ImageSpan------------------------");
        ImageSpan imageSpan = new ImageSpan(this,
                BitmapFactory.decodeResource(getResources(), R.mipmap.ic_launcher));
        spannableString11.setSpan(imageSpan, 0, 1, Spanned.SPAN_INCLUSIVE_INCLUSIVE);
        mImageSpanTextView.setText(spannableString11);


        //
        SpannableString spannableString12 = new SpannableString(
                "LeadingMarginSpan.Standard--------------------------------------------------");
        spannableString12.setSpan(new LeadingMarginSpan.Standard(96, 36), 0,
                spannableString12.length(), Spanned.SPAN_INCLUSIVE_INCLUSIVE);
        mLeadingMarginSpanTextView.setText(spannableString12);

        //LineBackgroundSpan接口类
        //LineHeightSpan接口类

        SpannableString spannableString13 = new SpannableString("LocaleSpan貌似没有什么效果或者我的用法不对");
        LocaleSpan localeSpan = new LocaleSpan(Locale.JAPAN);
        spannableString13.setSpan(localeSpan, 0, 4, Spanned.SPAN_INCLUSIVE_INCLUSIVE);
        mLocaleSpanTextView.setText(spannableString13);


        //targetSdkVersion设置为14或者以上的时候，BlurMaskFilter就不会起作用了！
        SpannableString spannableString14 = new SpannableString("MaskFilterSpan---api14上无效果，未验证");
        MaskFilterSpan maskFilterSpan = new MaskFilterSpan(
                new EmbossMaskFilter(new float[]{1, 1, 1}, 0.4f, 6, 3.5f));
        spannableString14.setSpan(maskFilterSpan, 0, spannableString14.length(),
                Spanned.SPAN_INCLUSIVE_INCLUSIVE);
        mMaskFilterSpanTextView.setText(spannableString14);

        //MetricAffectingSpan  抽象类

        //左侧出现引用符号 竖线
        SpannableString spannableString15 = new SpannableString("QuoteSpan");
        QuoteSpan quoteSpan = new QuoteSpan(Color.BLACK);
        spannableString15.setSpan(quoteSpan, 0, 5, Spanned.SPAN_INCLUSIVE_INCLUSIVE);
        mQuoteSpanTextView.setText(spannableString15);

        //貌似没有效果
        SpannableString spannableString16 = new SpannableString("RasterizerSpan，貌似没有效果");
        RasterizerSpan rasterizerSpan = new RasterizerSpan(new LayerRasterizer());
        spannableString16.setSpan(rasterizerSpan, 0, spannableString16.length(),
                Spanned.SPAN_INCLUSIVE_INCLUSIVE);
        mRasterizerSpanTextView.setText(spannableString16);

        //字体放大
        SpannableString spannableString17 = new SpannableString("RelativeSizeSpan");
        RelativeSizeSpan relativeSizeSpan = new RelativeSizeSpan(2.5F);
        spannableString17.setSpan(relativeSizeSpan, 0, 4, Spanned.SPAN_INCLUSIVE_INCLUSIVE);
        mRelativeSizeSpanTextView.setText(spannableString17);

        //RelpacementSpan  抽象类

        //字体宽度放大
        SpannableString spannableString18 = new SpannableString("ScaleXSpan");
        ScaleXSpan scaleXSpan = new ScaleXSpan(5);
        spannableString18.setSpan(scaleXSpan, 0, 4, Spanned.SPAN_INCLUSIVE_INCLUSIVE);
        mScaleXSpanTextView.setText(spannableString18);

        //SpellCheckSpan hide类，内部使用，外部无法调用

        //删除线
        SpannableString spannableString19 = new SpannableString("StrikethroughSpan");
        StrikethroughSpan strikethroughSpan = new StrikethroughSpan();
        spannableString19.setSpan(strikethroughSpan, 0, 4, Spanned.SPAN_INCLUSIVE_INCLUSIVE);
        mStrikethroughSpanTextView.setText(spannableString19);


        //主要由正常、粗体、斜体和同时加粗倾斜四种样式，常量值定义在Typeface类中。构造函数：
        SpannableString spannableString20 = new SpannableString("StyleSpan");
        Parcel parcel = Parcel.obtain();
        parcel.writeInt(Typeface.BOLD_ITALIC);
        parcel.setDataPosition(0);
        StyleSpan styleSpan = new StyleSpan(parcel);
        spannableString20.setSpan(styleSpan, 0, spannableString20.length(),
                Spanned.SPAN_INCLUSIVE_INCLUSIVE);
        mStyleSpanTextView.setText(spannableString20);

        //下标
        SpannableString spannableString21 = new SpannableString("SubscriptSpan9");
        SubscriptSpan subscriptSpan = new SubscriptSpan();
        spannableString21.setSpan(subscriptSpan, 0, spannableString21.length()-7, Spanned.SPAN_INCLUSIVE_INCLUSIVE);
        mSubscriptSpanTextView.setText(spannableString21);

        //SuggestionRangeSpan @hide  内部使用

        //貌似没有效果
        SpannableString spannableString22 = new SpannableString("SuggestionSpan貌似没有效果,可能是我用法不对");
        String[] arrs = new String[]{"aaa","bbb","ccc"};
        SuggestionSpan suggestionSpan = new SuggestionSpan(this, arrs, SuggestionSpan.FLAG_EASY_CORRECT);
        spannableString22.setSpan(suggestionSpan, 0, spannableString21.length()-7, Spanned.SPAN_INCLUSIVE_INCLUSIVE);
        mSuggestionSpanTextView.setText(spannableString22);

        //上标
        SpannableString spannableString23 = new SpannableString("SuperscriptSpan");
        SuperscriptSpan superscriptSpan = new SuperscriptSpan();
        spannableString23.setSpan(superscriptSpan, 0, spannableString21.length()-7, Spanned.SPAN_INCLUSIVE_INCLUSIVE);
        mSuperscriptSpanTextView.setText(spannableString23);

        //TabTopSpan 接口

        //Sets the text color, size, style, and typeface to match a TextAppearance
        SpannableString spannableString24 = new SpannableString("TextAppearanceSpan");
        TextAppearanceSpan textAppearanceSpan = new TextAppearanceSpan(this, R.style.StyleSpanDemo);
        spannableString24.setSpan(textAppearanceSpan, 0, spannableString24.length(), Spanned.SPAN_INCLUSIVE_INCLUSIVE);
        mTextAppearanceSpanTextView.setText(spannableString24);

        //TtsSpan 设置到语音朗读的 不做解释，用到再说

        //字体设置
        SpannableString spannableString25 = new SpannableString("TypefaceSpan");
        TypefaceSpan typefaceSpan= new TypefaceSpan("monospace");
        spannableString25.setSpan(typefaceSpan, 0, spannableString25.length(), Spanned.SPAN_INCLUSIVE_INCLUSIVE);
        mTypefaceSpanTextView.setText(spannableString25);

        //下划线
        SpannableString spannableString26 = new SpannableString("UnderlineSpan");
        UnderlineSpan underlineSpan= new UnderlineSpan();
        spannableString26.setSpan(underlineSpan, 0, spannableString25.length() - 4 , Spanned.SPAN_INCLUSIVE_INCLUSIVE);
        mUnderlineSpanTextView.setText(spannableString26);


        //URL
        SpannableString spannableString27 = new SpannableString("URLSpan------------------------------");
        URLSpan urlSpan = new URLSpan("https://www/baidu.com");
        spannableString27.setSpan(urlSpan, 0, spannableString26.length(), Spanned.SPAN_INCLUSIVE_INCLUSIVE);
        mURLSpanTextView.setText(spannableString27);

        //WrapTogetherSpan接口
    }
}
