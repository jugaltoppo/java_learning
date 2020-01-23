public class Buttons {
    private String title;
    private IOnClickListener onClickListener;
    public Buttons(String title)
    {
        this.title=title;
    }
    public String getTitle()
    {
        return this.title;
    }
    public void setOnClickListener(IOnClickListener onClickListener)
    {
        this.onClickListener=onClickListener;
    }

    public void OnClick()
    {
        this.onClickListener.onclick(this.title);
    }
    public interface IOnClickListener
    {
         void onclick(String title);
    }
}
