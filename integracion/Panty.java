Map params = ObjectUtils.asMap(
  "folder", "",
  "resource_type", "image"
);
try {
  Map result = cloudinary.uploader().upload(new File("/full/path/to/piclumen-1732311019187.png"), params);
  System.out.println(result);
} catch (IOException exception) {
  System.out.println(exception.getMessage());
}