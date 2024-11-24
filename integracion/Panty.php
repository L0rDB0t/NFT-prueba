$result = (new UploadApi())->upload('piclumen-1732311019187.png', [
    'folder' => '',
    'resource_type' => 'image']);
echo json_encode($result, JSON_PRETTY_PRINT);