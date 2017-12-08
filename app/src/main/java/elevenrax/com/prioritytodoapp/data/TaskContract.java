package elevenrax.com.prioritytodoapp.data;

import android.net.Uri;
import android.provider.BaseColumns;


public class TaskContract {

    // Uri Components for ContentProvider
    public static final String AUTHORITY = "elevenrax.com.prioritytodoapp";
    public static final Uri BASE_CONTENT_URI = Uri.parse("content://" + AUTHORITY);

    // Path for the "tasks" directory
    public static final String PATH_TASKS = "tasks";

    public static final class TaskEntry implements BaseColumns {

        public static final Uri CONTENT_URI =
                BASE_CONTENT_URI.buildUpon().appendPath(PATH_TASKS).build();


        // Table Schema
        public static final String TABLE_NAME = "tasks";

        // NB _ID inhereted from BaseColumns
        public static final String COLUMN_DESCRIPTION = "description";
        public static final String COLUMN_PRIORITY = "priority";


    }
}
