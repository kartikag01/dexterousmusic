package music.dexterous.com.dexterousmusic.adapters.list.viewholder;

import android.support.v7.widget.PopupMenu;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import music.dexterous.com.dexterousmusic.R;
import music.dexterous.com.dexterousmusic.adapters.list.AllArtistAdapter;
import music.dexterous.com.dexterousmusic.adapters.list.AllSongsAdapter;
import music.dexterous.com.dexterousmusic.customeviews.FontTextView;
import music.dexterous.com.dexterousmusic.utils.ui.UiUtils;

public class AllArtistViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
    private AllArtistAdapter.OnAlbumItemClickListener mOnClickListener;

    public ImageView mTextView;
    public FontTextView albumName;


    public AllArtistViewHolder(View itemView, AllArtistAdapter.OnAlbumItemClickListener onClickListener) {
        super(itemView);
        mTextView = (ImageView) itemView.findViewById(R.id.albumImage);
        albumName = (FontTextView) itemView.findViewById(R.id.albumName);

        this.mOnClickListener = onClickListener;
        itemView.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (mOnClickListener != null) {
            switch (view.getId()) {
                default:
                    mOnClickListener.onClick(view, getAdapterPosition());
            }
        }
    }

}