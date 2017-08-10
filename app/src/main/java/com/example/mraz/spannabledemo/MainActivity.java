package com.example.mraz.spannabledemo;

import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
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
import android.text.style.LineHeightSpan;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

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
    @BindView(R.id.LineBackgroundSpan)
    TextView mLineBackgroundSpanTextView;
    @BindView(R.id.LineHeightSpan)
    TextView mLineHeightSpanTextView;
    @BindView(R.id.LocaleSpan)
    TextView mLocaleSpanTextView;
    @BindView(R.id.MaskFilterSpan)
    TextView mMaskFilterSpanTextView;
    @BindView(R.id.MetricAffectingSpan)
    TextView mMetricAffectingSpanTextView;
    @BindView(R.id.QuoteSpan)
    TextView mQuoteSpanTextView;
    @BindView(R.id.RasterizerSpan)
    TextView mRasterizerSpanTextView;
    @BindView(R.id.RelativeSizeSpan)
    TextView mRelativeSizeSpanTextView;
    @BindView(R.id.ReplacementSpan)
    TextView mReplacementSpanTextView;
    @BindView(R.id.ScaleXSpan)
    TextView mScaleXSpanTextView;
    @BindView(R.id.SpellCheckSpan)
    TextView mSpellCheckSpanTextView;
    @BindView(R.id.StrikethroughSpan)
    TextView mStrikethroughSpanTextView;
    @BindView(R.id.StyleSpan)
    TextView mStyleSpanTextView;
    @BindView(R.id.SuggestionRangeSpan)
    TextView mSuggestionRangeSpanTextView;
    @BindView(R.id.SuggestionSpan)
    TextView mSuggestionSpanTextView;
    @BindView(R.id.SuperscriptSpan)
    TextView mSuperscriptSpanTextView;
    @BindView(R.id.TabStopSpan)
    TextView mTabStopSpanTextView;
    @BindView(R.id.TextAppearanceSpan)
    TextView mTextAppearanceSpanTextView;
    @BindView(R.id.TtsSpan)
    TextView mTtsSpanTextView;
    @BindView(R.id.TypefaceSpan)
    TextView mTypefaceSpanTextView;
    @BindView(R.id.UnderlineSpan)
    TextView mUnderlineSpanTextView;
    @BindView(R.id.URLSpan)
    TextView mURLSpanTextView;
    @BindView(R.id.WrapTogetherSpan)
    TextView mWrapTogetherSpanTextView;
    @BindView(R.id.ForegroundColorSpan)
    TextView mForegroundColorSpanTextView;
    @BindView(R.id.IconMarginSpan)
    TextView mIconMarginSpanTextView;
    @BindView(R.id.ImageSpan)
    TextView mImageSpanTextView;

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
//        CustomClickableSpan customClickableSpan = new CustomClickableSpan(this);
//        spannableString5.setSpan(customClickableSpan, 0, 5, Spanned.SPAN_INCLUSIVE_INCLUSIVE);
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


        SpannableString spannableString8 = new SpannableString("EasyEditSpan");
        EasyEditSpan easyEditSpan = new EasyEditSpan();
        spannableString8.setSpan(easyEditSpan, 0, spannableString8.length(),
                Spanned.SPAN_INCLUSIVE_INCLUSIVE);
        mEasyEditSpanTextView.setText(spannableString8);

        SpannableString spannableString9 = new SpannableString("ForegroundColorSpan");
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(Color.parseColor("#AABBCC"));
        spannableString9.setSpan(foregroundColorSpan, 1, spannableString9.length()-1, Spanned.SPAN_INCLUSIVE_INCLUSIVE);
        mForegroundColorSpanTextView.setText(spannableString9);

        SpannableString spannableString10 = new SpannableString("IconMarginSpan------------------------");
        IconMarginSpan iconMarginSpan = new IconMarginSpan(BitmapFactory.decodeResource(getResources(),R.mipmap.ic_launcher));
        spannableString10.setSpan(iconMarginSpan, 0, spannableString10.length(), Spanned.SPAN_INCLUSIVE_INCLUSIVE);
        mIconMarginSpanTextView.setText(spannableString10);

        SpannableString spannableString11= new SpannableString("ImageSpan------------------------");
        ImageSpan imageSpan = new ImageSpan(this, BitmapFactory.decodeResource(getResources(),R.mipmap.ic_launcher));
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


    }
}
