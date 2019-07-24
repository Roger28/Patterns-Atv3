package imagefactoryplugin;

import editorframeworkinterfaces.IDocumentSerializer;

public class ImageSerializer implements IDocumentSerializer{

	@Override
	public boolean load() {
		System.out.println("ImageFactoryPlugin: Document loaded successfully...!");
		return true;
	}

	@Override
	public boolean save() {
		System.out.println("ImageFactoryPlugin: Document saved successfully...!");
		return true;
	}

}
