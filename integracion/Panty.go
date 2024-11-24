var ctx = context.Background()
uploadResult, _ := cld.Upload.Upload(
    ctx,
    "piclumen-1732311019187.png",
    uploader.UploadParams{
      ResourceType: "image",
    })
log.Println(uploadResult)