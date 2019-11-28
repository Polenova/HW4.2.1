package ru.android.polenova;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;


import java.util.List;

public class ContactAdapter extends BaseAdapter {

    private List<ContactItem> contactItemList;
    private LayoutInflater layoutInFlater;

    ContactAdapter(Context context, List<ContactItem> contactItemList) {
        this.contactItemList = contactItemList;
        layoutInFlater = LayoutInflater.from(context);
    }

    private CompoundButton.OnCheckedChangeListener myCheckChangeList
            = new CompoundButton.OnCheckedChangeListener() {
        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
            contactItemList.get((Integer) buttonView.getTag()).setChecked(isChecked);
        }
    };

    void addItem(ContactItem item) {
        this.contactItemList.add(item);
        notifyDataSetChanged();
    }

    void removeItem(int position) {
        contactItemList.remove(position);
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return contactItemList.size();
    }

    @Override
    public Object getItem(int position) {
        return contactItemList.get(position);
    }

    public ContactItem getContactItem(int position) {
        return contactItemList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        if (view==null) {
            view = layoutInFlater.inflate(R.layout.hello_item, parent, false);

        }
        ContactItem contactItem = getContactItem(position);
        ImageView icon = view.findViewById(R.id.ImageViewIcon);
        TextView call = view.findViewById(R.id.TextViewCall);
        TextView contact= view.findViewById(R.id.TextViewContact);
        CheckBox selectCheckBox = view.findViewById(R.id.ChekBoxSelect);
        contact.setText(contactItem.getContactInfo());
        call.setText(contactItem.getCallContact());
        icon.setImageDrawable(contactItem.getImageIcon());
        selectCheckBox.setOnCheckedChangeListener(myCheckChangeList);
        selectCheckBox.setTag(position);
        selectCheckBox.setChecked(contactItem.isChecked());
        return view;
    }
}
