
package folder;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class GeocodingResult {

    @SerializedName("input")
    @Expose
    private Input input;
    @SerializedName("addressMatches")
    @Expose
    private List<AddressMatch> addressMatches;

    public Input getInput() {
        return input;
    }

    public void setInput(Input input) {
        this.input = input;
    }

    public List<AddressMatch> getAddressMatches() {
        return addressMatches;
    }

    public void setAddressMatches(List<AddressMatch> addressMatches) {
        this.addressMatches = addressMatches;
    }

}
