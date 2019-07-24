package textfactoryplugin;

import editorframeworkinterfaces.IDocumentValidator;

public class TextValidator implements IDocumentValidator {

	@Override
	public boolean validate() {
		System.out.println("TextFactoryPlugin: Document successfully validated!");
		return true;
	}

}
