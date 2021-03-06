/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package io.confluent.developer.avro;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class Rating extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -4333141909960267442L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Rating\",\"namespace\":\"io.confluent.developer.avro\",\"fields\":[{\"name\":\"title\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"release_year\",\"type\":\"int\"},{\"name\":\"rating\",\"type\":\"double\"},{\"name\":\"timestamp\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Rating> ENCODER =
      new BinaryMessageEncoder<Rating>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Rating> DECODER =
      new BinaryMessageDecoder<Rating>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<Rating> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<Rating> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<Rating> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<Rating>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this Rating to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a Rating from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a Rating instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static Rating fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public java.lang.String title;
  @Deprecated public int release_year;
  @Deprecated public double rating;
  @Deprecated public java.lang.String timestamp;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Rating() {}

  /**
   * All-args constructor.
   * @param title The new value for title
   * @param release_year The new value for release_year
   * @param rating The new value for rating
   * @param timestamp The new value for timestamp
   */
  public Rating(java.lang.String title, java.lang.Integer release_year, java.lang.Double rating, java.lang.String timestamp) {
    this.title = title;
    this.release_year = release_year;
    this.rating = rating;
    this.timestamp = timestamp;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return title;
    case 1: return release_year;
    case 2: return rating;
    case 3: return timestamp;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: title = value$ != null ? value$.toString() : null; break;
    case 1: release_year = (java.lang.Integer)value$; break;
    case 2: rating = (java.lang.Double)value$; break;
    case 3: timestamp = value$ != null ? value$.toString() : null; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'title' field.
   * @return The value of the 'title' field.
   */
  public java.lang.String getTitle() {
    return title;
  }


  /**
   * Sets the value of the 'title' field.
   * @param value the value to set.
   */
  public void setTitle(java.lang.String value) {
    this.title = value;
  }

  /**
   * Gets the value of the 'release_year' field.
   * @return The value of the 'release_year' field.
   */
  public int getReleaseYear() {
    return release_year;
  }


  /**
   * Sets the value of the 'release_year' field.
   * @param value the value to set.
   */
  public void setReleaseYear(int value) {
    this.release_year = value;
  }

  /**
   * Gets the value of the 'rating' field.
   * @return The value of the 'rating' field.
   */
  public double getRating() {
    return rating;
  }


  /**
   * Sets the value of the 'rating' field.
   * @param value the value to set.
   */
  public void setRating(double value) {
    this.rating = value;
  }

  /**
   * Gets the value of the 'timestamp' field.
   * @return The value of the 'timestamp' field.
   */
  public java.lang.String getTimestamp() {
    return timestamp;
  }


  /**
   * Sets the value of the 'timestamp' field.
   * @param value the value to set.
   */
  public void setTimestamp(java.lang.String value) {
    this.timestamp = value;
  }

  /**
   * Creates a new Rating RecordBuilder.
   * @return A new Rating RecordBuilder
   */
  public static io.confluent.developer.avro.Rating.Builder newBuilder() {
    return new io.confluent.developer.avro.Rating.Builder();
  }

  /**
   * Creates a new Rating RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Rating RecordBuilder
   */
  public static io.confluent.developer.avro.Rating.Builder newBuilder(io.confluent.developer.avro.Rating.Builder other) {
    if (other == null) {
      return new io.confluent.developer.avro.Rating.Builder();
    } else {
      return new io.confluent.developer.avro.Rating.Builder(other);
    }
  }

  /**
   * Creates a new Rating RecordBuilder by copying an existing Rating instance.
   * @param other The existing instance to copy.
   * @return A new Rating RecordBuilder
   */
  public static io.confluent.developer.avro.Rating.Builder newBuilder(io.confluent.developer.avro.Rating other) {
    if (other == null) {
      return new io.confluent.developer.avro.Rating.Builder();
    } else {
      return new io.confluent.developer.avro.Rating.Builder(other);
    }
  }

  /**
   * RecordBuilder for Rating instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Rating>
    implements org.apache.avro.data.RecordBuilder<Rating> {

    private java.lang.String title;
    private int release_year;
    private double rating;
    private java.lang.String timestamp;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(io.confluent.developer.avro.Rating.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.title)) {
        this.title = data().deepCopy(fields()[0].schema(), other.title);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.release_year)) {
        this.release_year = data().deepCopy(fields()[1].schema(), other.release_year);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.rating)) {
        this.rating = data().deepCopy(fields()[2].schema(), other.rating);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.timestamp)) {
        this.timestamp = data().deepCopy(fields()[3].schema(), other.timestamp);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
    }

    /**
     * Creates a Builder by copying an existing Rating instance
     * @param other The existing instance to copy.
     */
    private Builder(io.confluent.developer.avro.Rating other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.title)) {
        this.title = data().deepCopy(fields()[0].schema(), other.title);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.release_year)) {
        this.release_year = data().deepCopy(fields()[1].schema(), other.release_year);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.rating)) {
        this.rating = data().deepCopy(fields()[2].schema(), other.rating);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.timestamp)) {
        this.timestamp = data().deepCopy(fields()[3].schema(), other.timestamp);
        fieldSetFlags()[3] = true;
      }
    }

    /**
      * Gets the value of the 'title' field.
      * @return The value.
      */
    public java.lang.String getTitle() {
      return title;
    }


    /**
      * Sets the value of the 'title' field.
      * @param value The value of 'title'.
      * @return This builder.
      */
    public io.confluent.developer.avro.Rating.Builder setTitle(java.lang.String value) {
      validate(fields()[0], value);
      this.title = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'title' field has been set.
      * @return True if the 'title' field has been set, false otherwise.
      */
    public boolean hasTitle() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'title' field.
      * @return This builder.
      */
    public io.confluent.developer.avro.Rating.Builder clearTitle() {
      title = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'release_year' field.
      * @return The value.
      */
    public int getReleaseYear() {
      return release_year;
    }


    /**
      * Sets the value of the 'release_year' field.
      * @param value The value of 'release_year'.
      * @return This builder.
      */
    public io.confluent.developer.avro.Rating.Builder setReleaseYear(int value) {
      validate(fields()[1], value);
      this.release_year = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'release_year' field has been set.
      * @return True if the 'release_year' field has been set, false otherwise.
      */
    public boolean hasReleaseYear() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'release_year' field.
      * @return This builder.
      */
    public io.confluent.developer.avro.Rating.Builder clearReleaseYear() {
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'rating' field.
      * @return The value.
      */
    public double getRating() {
      return rating;
    }


    /**
      * Sets the value of the 'rating' field.
      * @param value The value of 'rating'.
      * @return This builder.
      */
    public io.confluent.developer.avro.Rating.Builder setRating(double value) {
      validate(fields()[2], value);
      this.rating = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'rating' field has been set.
      * @return True if the 'rating' field has been set, false otherwise.
      */
    public boolean hasRating() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'rating' field.
      * @return This builder.
      */
    public io.confluent.developer.avro.Rating.Builder clearRating() {
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'timestamp' field.
      * @return The value.
      */
    public java.lang.String getTimestamp() {
      return timestamp;
    }


    /**
      * Sets the value of the 'timestamp' field.
      * @param value The value of 'timestamp'.
      * @return This builder.
      */
    public io.confluent.developer.avro.Rating.Builder setTimestamp(java.lang.String value) {
      validate(fields()[3], value);
      this.timestamp = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'timestamp' field has been set.
      * @return True if the 'timestamp' field has been set, false otherwise.
      */
    public boolean hasTimestamp() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'timestamp' field.
      * @return This builder.
      */
    public io.confluent.developer.avro.Rating.Builder clearTimestamp() {
      timestamp = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Rating build() {
      try {
        Rating record = new Rating();
        record.title = fieldSetFlags()[0] ? this.title : (java.lang.String) defaultValue(fields()[0]);
        record.release_year = fieldSetFlags()[1] ? this.release_year : (java.lang.Integer) defaultValue(fields()[1]);
        record.rating = fieldSetFlags()[2] ? this.rating : (java.lang.Double) defaultValue(fields()[2]);
        record.timestamp = fieldSetFlags()[3] ? this.timestamp : (java.lang.String) defaultValue(fields()[3]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Rating>
    WRITER$ = (org.apache.avro.io.DatumWriter<Rating>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Rating>
    READER$ = (org.apache.avro.io.DatumReader<Rating>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeString(this.title);

    out.writeInt(this.release_year);

    out.writeDouble(this.rating);

    out.writeString(this.timestamp);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.title = in.readString();

      this.release_year = in.readInt();

      this.rating = in.readDouble();

      this.timestamp = in.readString();

    } else {
      for (int i = 0; i < 4; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.title = in.readString();
          break;

        case 1:
          this.release_year = in.readInt();
          break;

        case 2:
          this.rating = in.readDouble();
          break;

        case 3:
          this.timestamp = in.readString();
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










