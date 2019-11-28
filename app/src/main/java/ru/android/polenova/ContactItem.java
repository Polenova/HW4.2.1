package ru.android.polenova;

import android.graphics.drawable.Drawable;
import android.widget.CheckBox;
import android.widget.ImageView;

public class ContactItem {

    private Drawable imageIcon;
    private String contactInfo;
    private String callContact;
    private boolean CheckBoxSelect;

    public ContactItem(Drawable imageIcon,  String callContact, String contactInfo, boolean checkBoxSelect) {
        this.imageIcon = imageIcon;
        this.callContact = callContact;
        this.contactInfo = contactInfo;
        CheckBoxSelect = checkBoxSelect;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public Drawable getImageIcon() {
        return imageIcon;
    }

    public void setImageIcon(Drawable imageIcon) {
        this.imageIcon = imageIcon;
    }

    public String getCallContact() {
        return callContact;
    }

    public void setCallContact(String callContact) {
        this.callContact = callContact;
    }

    public boolean isChecked() {
        return CheckBoxSelect;
    }

    public void setChecked(boolean checkBoxSelect) {
        CheckBoxSelect = checkBoxSelect;
    }
}
