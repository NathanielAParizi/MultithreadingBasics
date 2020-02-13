# MultithreadingBasics

Illustrating basics of multithreading. In order to post results to the UI thread with Thread(Runnable{}).
It's best to use runOnUIThread(). AsyncTaskDemo uses AyncTask class to sort an array of random numbers asynchronously.
AsyncTask is now depricated.

                                    Thread(Runnable{ runOnUIThread{} })


************************************************************************

Research:

1. What are loaders and how do we implement loaders?

Introduced in Android 3.0, loaders are used for handling asynchronous loading of data into fragments
and activities. Loaders are available to every fragment and Activity. They load data asynchronously.
They monitor their data and if content changes in that data, they will report on it.
They reconnect to the last loader's cursor automatically when recreated during configuration changes,
which means they don't have to requery data.

2. What is an AsyncTaskLoader?

AsyncTaskLoader handles what AsyncTask normally does, however it is follows lifecycle changes of both
fragments and activities.

For implementation you must Implement LoaderManager.LoaderCallbacks<String> and then must override 3 methods,
onCreateLoader, onLoadFinished and onLoaderReset

Generally, Abstract Loader provides an AsyncTask to do the work.

3. What is a Handler Thread for?

In Android, the "Handler Thread" refers to a specific thread that holds a Looper. It is an extension of "Thread" class.
The Looper is used to create Handlers. Thread.start() must still be called.
HandlerThreads run outside of an activity’s lifecycle, so they must be implemented properly in order to avoid thread leaks.
HandlerThread doesn’t have a time out either.  Posting back to the main thread involves a bit more boiler plane code as well.
AsyncTasks have a single thread dedicated to them so if you have multiple AsyncTasks executing during runtime, there will be
performance issues. They aren't truly asynchronous because of this issue. Another issue is that AsyncTask can still be running
even after configuration change.

4. What are some common threading restrictions in android?

Do not block the UI thread
Do not access the Android UI toolkit from outside the UI thread
 
5. What are thread pools and thread pool executors?

