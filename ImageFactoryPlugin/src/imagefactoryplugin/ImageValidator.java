package imagefactoryplugin;

import editorframeworkinterfaces.IDocumentValidator;

public class ImageValidator implements IDocumentValidator{

	@Override
	public boolean validate() {
		System.out.println("ImageFactoryPlugin: Document successfully validated...!");
		return true;
	}

}
