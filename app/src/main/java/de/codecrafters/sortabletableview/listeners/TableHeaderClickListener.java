package de.codecrafters.sortabletableview.listeners;

/**
 * Listener interface to listen for clicks on table headers of a {@link SortableTableView}.
 *
 * @author ISchwarz
 */
public interface TableHeaderClickListener {

    /**
     * This method is called of a table header was clicked.
     *
     * @param columnIndex
     */
    void onHeaderClicked(int columnIndex);

}
