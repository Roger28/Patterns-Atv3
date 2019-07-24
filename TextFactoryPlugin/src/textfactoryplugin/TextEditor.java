package textfactoryplugin;

import editorframeworkinterfaces.IDocumentEditor;

public class TextEditor implements IDocumentEditor {

	@Override
	public boolean open() {
		System.out.println("TextFactoryPlugin: Document opened successfully!");
		return true;
	}

}
