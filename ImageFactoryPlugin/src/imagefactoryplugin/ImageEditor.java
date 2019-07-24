package imagefactoryplugin;

import editorframeworkinterfaces.IDocumentEditor;

public class ImageEditor implements IDocumentEditor{

	@Override
	public boolean open() {
		System.out.println("ImageFactoryPlugin: Document opened successfully...!");
		return true;
	}

}
