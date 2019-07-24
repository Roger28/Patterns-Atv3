package textfactoryplugin;

import editorframeworkinterfaces.IDocumentSerializer;

public class TextSerializer implements IDocumentSerializer {

	@Override
	public boolean load() {
		System.out.println("TextFactoryPlugin: Document loaded successfully!");
		return true;
	}

	@Override
	public boolean save() {
		System.out.println("TextFactoryPlugin: Document saved successfully!");
		return true;
	}

}
